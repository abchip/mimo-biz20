/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.service.j2v8;

import com.eclipsesource.v8.V8;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8Object;

public class T {

	public static void main(String[] args) {
		V8 runtime = V8.createV8Runtime();
		int result = runtime.executeIntegerScript("" + "var hello = 'hello, ';\n" + "var world = 'world!';\n" + "hello.concat(world).length;\n");
		System.out.println(result);
		
		runtime.executeVoidScript(""
				+"var hockeyTeam = {\n" + 
				"     name      : 'WolfPack',\n" + 
				"     players   : [],\n" + 
				"     addPlayer : function(player) {\n" + 
				"                   this.players.push(player);\n" + 
				"                   return this.players.length;\n" + 
				"     }\n" + 
				"}\n");
		
		runtime.executeVoidScript(""
				    + "var person = {};\n"
				    + "person.first = 'Ian';\n"
				    + "person['last'] = 'Bull';\n"
				    + "person.hockeyTeam = hockeyTeam;\n");
		  
		V8Object person = runtime.getObject("person");
		V8Object hockeyTeam = person.getObject("hockeyTeam");
		System.out.println(hockeyTeam.getString("name"));
		person.release();
		
		V8Object player1 = new V8Object(runtime).add("name", "John");
		V8Object player2 = new V8Object(runtime).add("name", "Chris");
		V8Array players = new V8Array(runtime).push(player1).push(player2);
		hockeyTeam.add("players", players);
		
		V8Array parameters = new V8Array(runtime).push(player1);
		int size = hockeyTeam.executeIntegerFunction("addPlayer", parameters);
		System.out.println(size);
		parameters.release();
		
		player1.release();
		player2.release();
		players.release();
		
		hockeyTeam.release();		  
		runtime.release();
	}
}
