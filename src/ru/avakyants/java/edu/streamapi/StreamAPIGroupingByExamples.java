package ru.avakyants.java.edu.streamapi;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import ru.avakyants.java.edu.model.Worker;

public class StreamAPIGroupingByExamples {

	public static void main(String[] args) {
		Worker w1 = new Worker("Misha",33,110,"Developer");
		Worker w2 = new Worker("Dima",34,80,"Developer");
		Worker w3 = new Worker("Andrey",30,100,"Analytic");
		Worker w4 = new Worker("Yulia",24,70,"Analytic");
		Worker w5 = new Worker("Ada",25,80,"Analytic");
		Worker w6 = new Worker("Max",34,120,"Team Lead");
		Worker w7 = new Worker("Artem",33,150,"Team Lead");
		Worker w8 = new Worker("Dina",33,130,"Team Lead");
		Worker w9 = new Worker("Sergey",27,90,"Developer");
		Worker w10 = new Worker("Vladimir",33,100,"Developer");
		Worker w11 = new Worker("Alexey",33,200,"Chief");
		
		List<Worker> workers = List.of(w1,w2,w3,w4,w5,w6,w7,w8,w9,w10,w11);
		
		/*GROUP BY POSITION (List)*/
		System.out.println("-----------------------------------GROUP BY POSITION (List)-----------------------------------------");
		Map<String, List<Worker>> map = workers.stream().collect(Collectors.groupingBy(Worker::getPosition));
		for(String pos : map.keySet()) {
			System.out.println(pos);
			map.get(pos).stream().map(Worker::getName).forEach(name -> System.out.println("- "+name));
		}
		
		/*GROUP BY POSITION (Sets)*/
		System.out.println("-----------------------------------GROUP BY POSITION (Sets)-----------------------------------------");
		Map<String, Set<Worker>> map2 = workers.stream().collect(Collectors.groupingBy(Worker::getPosition, Collectors.toSet()));
		for(String pos : map2.keySet()) {
			System.out.println(pos);
			map2.get(pos).stream().map(Worker::getName).forEach(name -> System.out.println("- "+name));
		}
		
		/*COUNT WORKERS BY POSITION*/
		System.out.println("-----------------------------------COUNT WORKERS BY POSITION-----------------------------------------");
		Map<String, Long> map3 = workers.stream().collect(Collectors.groupingBy(Worker::getPosition, Collectors.counting()));
		map3.forEach((k,v)->System.out.println(k+": "+v));
		
		
		/* GROUPING BY POSITION, ONLY NAMES*/
		System.out.println("-----------------------------------GROUPING BY POSITION, ONLY NAMES-----------------------------------------");
		Map<String, Set<String>> map4 = workers.stream().collect(Collectors.groupingBy(Worker::getPosition, Collectors.mapping(Worker::getName, Collectors.toSet())));
		map4.forEach((k,v)->{System.out.println(k);v.forEach(name->System.out.println("- "+name));});
		
		
		/* AVG SALARY BY POSITION*/
		System.out.println("-----------------------------------AVG SALARY BY POSITION-----------------------------------------");
		Map<String, Double> map5 = workers.stream().collect(Collectors.groupingBy(Worker::getPosition,Collectors.averagingInt(Worker::getSalary)));
		map5.forEach((k,v)->System.out.println(k+": "+v));
		
		/*GROUPING BY POSITION, NAMES IN 1 ROW*/
		System.out.println("-----------------------------------GROUPING BY POSITION, NAMES IN 1 ROW-----------------------------------------");
		Map<String, String> map6 = workers.stream().collect(Collectors.groupingBy(Worker::getPosition,Collectors.mapping(Worker::getName, Collectors.joining(", ", "{", "}"))));
		map6.forEach((k,v)->System.out.println(k+": "+v));
		
		/*GROuPING BY POSITION & AGE*/
		System.out.println("-----------------------------------GROuPING BY POSITION & AGE-----------------------------------------");
		Map<String, Map<Integer,List<Worker>>> map7 = workers.stream().collect(Collectors.groupingBy(Worker::getPosition,Collectors.groupingBy(Worker::getAge)));
		for(String pos : map7.keySet()) {
			System.out.println(pos);
			for(Integer age : (map7.get(pos)).keySet()) {
				System.out.println("Age: "+age);
				for(Worker w : map7.get(pos).get(age)) {
					System.out.println("- "+w.getName());
				}
			}
		}
	}
	

}
