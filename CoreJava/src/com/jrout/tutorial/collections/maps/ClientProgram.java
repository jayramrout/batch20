package com.jrout.tutorial.collections.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ClientProgram {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("one", "Jayram");
		map.put("two", "Two");
		System.out.println(map);
		
		Iterator iter = map.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry mapEntry = (Map.Entry)iter.next();
			System.out.println(mapEntry.getKey() +" "+ mapEntry.getValue());
		}
		
		// TODO Auto-generated method stub
/*		Map electronics = getAllObjects();
		Map compMap = (Map)electronics.get("computer");
		System.out.println(compMap);
		List comp = (List)compMap.get("Dell");
		for(int i = 0 ;i < comp.size(); i++) {
			Computer computer = (Computer)comp.get(i);
			System.out.println(computer.getName());
		}
*/	}

	
	public static Map getAllObjects(){
		Computer dell1 = new Computer("Dell1");
		Computer dell2 = new Computer("Dell2");
		Computer dell3 = new Computer("Dell3");
		
		List<Computer> dellComputers = new ArrayList<Computer>();
		dellComputers.add(dell1);dellComputers.add(dell2);dellComputers.add(dell3);

		Computer apple1 = new Computer("Apple1");
		Computer apple2 = new Computer("Apple2");
		Computer apple3 = new Computer("Apple3");

		List<Computer> appleComputers = new ArrayList<Computer>();
		appleComputers.add(apple1);appleComputers.add(apple2);appleComputers.add(apple3);

		Map<String,List<Computer>> compMap = new HashMap<String,List<Computer>>();
		compMap.put("Dell", dellComputers);
		compMap.put("Apple", appleComputers);
		
		Camera nikon1 = new Camera("Nikon1");
		Camera nikon2 = new Camera("Nikon2");
		List<Camera> nikons = new ArrayList<Camera>();
		nikons.add(nikon1);nikons.add(nikon2);

		Camera canon1 = new Camera("Canon1");
		Camera canon2 = new Camera("Canon2");
		List<Camera> canons = new ArrayList<Camera>();
		canons.add(canon1); canons.add(canon2);
		
		Map cameraMap = new HashMap<>();
		cameraMap.put("Nikon", nikons);
		cameraMap.put("Canon", canons);

		Map electronics = new HashMap();
		electronics.put("computer", compMap);
		electronics.put("camera", cameraMap);
		
		return electronics;
	}
}
