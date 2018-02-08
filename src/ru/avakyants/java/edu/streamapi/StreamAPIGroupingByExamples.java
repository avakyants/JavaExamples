package ru.avakyants.java.edu.streamapi;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import ru.avakyants.java.edu.model.Worker;

public class StreamAPIGroupingByExamples {

	public static void main(String[] args) {
		Worker w1 = new Worker("Misha",33,100,"Developer");
		Worker w2 = new Worker("Dima",34,80,"Developer");
		Worker w3 = new Worker("Andrey",30,100,"Analytic");
		Worker w4 = new Worker("Yulia",24,70,"Analytic");
		Worker w5 = new Worker("Ada",25,80,"Analytic");
		Worker w6 = new Worker("Max",34,150,"Team Lead");
		Worker w7 = new Worker("Artem",33,150,"Team Lead");
		Worker w8 = new Worker("Dina",33,150,"Team Lead");
		Worker w9 = new Worker("Sergey",27,100,"Developer");
		Worker w10 = new Worker("Vladimir",33,100,"Developer");
		Worker w11 = new Worker("Alexey",33,200,"Chief");
		
		List<Worker> workers = List.of(w1,w2,w3,w4,w5,w6,w7,w8,w9,w10,w11);
		
		/*GROUP BY POSITION*/
		Map<String, List<Worker>> map = workers.stream().collect(Collectors.groupingBy(Worker::getPosition));
		for(String pos : map.keySet()) {
			System.out.println(pos);
			for(Worker w : map.get(pos)) {
				System.out.println("- "+w.getName());
			}
		}
	}
	

}
