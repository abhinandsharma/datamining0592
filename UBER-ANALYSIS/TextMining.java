

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.io.*;
public class TextMining 
{

	public static void main(String[] args) {

		Map<String,Double> map = new HashMap<String,Double>();
		map.put("happy", 1.04);
		map.put("reliable", 1.04);
		map.put("fair", 1.04);
		map.put("good", 0.54);
		map.put("experience", 1.04);
		map.put("wise", 1.04);
		map.put("price", 1.04);
		map.put("perfect", 1.04);
		map.put("love", 0.77);
		map.put("services", 0.54);
		map.put("friendly", 1.04);
		map.put("cheaper", 0.77);
		map.put("helpful", 0.77);
		map.put("awesome", 0.77);
		map.put("cheaper", 1.04);
		map.put("easy", 0.77);
		map.put("poor", 1.04);
		map.put("service", 0.77);
		map.put("bad", 1.04);
		map.put("disgusting", 0.77);
		map.put("not", 0.77);
		map.put("unable", 1.04);
		map.put("comment", 0.63);
		map.put("issue", 0.77);
		map.put("time", 1.04);
		map.put("long", 0.77);
		map.put("best", 0.63);
		map.put("bad", 1.04);
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the terms ");
		String value=scanner.nextLine();
		String[] splitValue = value.split(" ");
		List<String> splitList1 = new ArrayList<String>(Arrays.asList(splitValue));
		List<Double> compareValue = new ArrayList<Double>();
		for(String val:splitList1){
			for(Map.Entry<String, Double> mapValues:map.entrySet()){
				if(mapValues.getKey().equalsIgnoreCase(val)){
					compareValue.add(mapValues.getValue());
				}
			}
		}
		System.out.println(compareValue);
		double[] sv1 = {1.04,1.04,2.08,2.08,1.04};
		double[] sv2 = {1.04,0.77,1.08,1.54,0.77};
		double[] sv3 = {1.07,0.77,0.54,0.0,0.0};
		double[] sv4 = {1.04,1.04,0.77,0.0,0.0};
		double[] sv5 = {0.77,0.77,0.0,0.0,0.0};
		 
		 
		double[] gv1 = {0.77,0.77,1.04,0.77,0.0};
		double[] gv2 =  {1.54,1.04,0.63,0.0,0.0};
		double[] gv3 = {0.77,0.77,0.77,0.0,0.0};
		double[] gv4 = {2.04,1.04,1.04,0.0,0.0};
		double[] gv5 = {1.54,1.04,1.04,0.0,0.0};
		List<Double> productValues = new ArrayList<Double>();
		for(int x=0;x<compareValue.size();x++){
			for(int i=0;i<sv1.length;i++){
				if(x==i){
					Double mVal = compareValue.get(x)*sv1[i];
					productValues.add(mVal);
				}
				
			}
			
		}
		
		Double squaredVal1 = Math.sqrt(sv1[0])+Math.sqrt(sv1[1])+Math.sqrt(sv1[2])+Math.sqrt(sv1[3])+Math.sqrt(sv1[4]);
		Double squaredVal2 = Math.sqrt(sv2[0])+Math.sqrt(sv2[1])+Math.sqrt(sv2[2])+Math.sqrt(sv2[3])+Math.sqrt(sv2[4]);
		Double squaredVal3 = Math.sqrt(sv3[0])+Math.sqrt(sv3[1])+Math.sqrt(sv3[2])+Math.sqrt(sv3[3])+Math.sqrt(sv3[4]);
		Double squaredVal4 = Math.sqrt(sv4[0])+Math.sqrt(sv4[1])+Math.sqrt(sv4[2])+Math.sqrt(sv4[3])+Math.sqrt(sv4[4]);
		Double squaredVal5 = Math.sqrt(sv5[0])+Math.sqrt(sv5[1])+Math.sqrt(sv5[2])+Math.sqrt(sv5[3])+Math.sqrt(sv5[4]);
		Double squaredVal6 = Math.sqrt(gv1[0])+Math.sqrt(gv1[1])+Math.sqrt(gv1[2])+Math.sqrt(gv1[3])+Math.sqrt(gv1[4]);
		Double squaredVal7 = Math.sqrt(gv2[0])+Math.sqrt(gv2[1])+Math.sqrt(gv2[2])+Math.sqrt(gv2[3])+Math.sqrt(gv2[4]);
		Double squaredVal8 = Math.sqrt(gv3[0])+Math.sqrt(gv3[1])+Math.sqrt(gv3[2])+Math.sqrt(gv3[3])+Math.sqrt(gv3[4]);
		Double squaredVal9 = Math.sqrt(gv4[0])+Math.sqrt(gv4[1])+Math.sqrt(gv4[2])+Math.sqrt(gv4[3])+Math.sqrt(gv4[4]);
		Double squaredVal10 = Math.sqrt(gv5[0])+Math.sqrt(gv5[1])+Math.sqrt(gv5[2])+Math.sqrt(gv5[3])+Math.sqrt(gv5[4]);
		//Double inputSquareVal = Math.sqrt(sv1[0])+Math.sqrt(sv1[1])+Math.sqrt(sv1[2])+Math.sqrt(sv1[3])+Math.sqrt(sv1[4])+Math.sqrt(sv1[5])+Math.sqrt(sv1[6]);
		//Map<String, Double> compareValue;
		Double cSquR = Math.sqrt(compareValue.get(0))+Math.sqrt(compareValue.get(1))+Math.sqrt(compareValue.get(2))+Math.sqrt(compareValue.get(3))+Math.sqrt(compareValue.get(4))+Math.sqrt(compareValue.get(5))+Math.sqrt(compareValue.get(6));
		Double iMul = productValues.get(0)+productValues.get(1)+productValues.get(2)+productValues.get(3)+productValues.get(4);
		Float cosine1 = (float) (iMul/(squaredVal1*cSquR));
		Float cosine2 = (float) (iMul/(squaredVal2*cSquR));
		Float cosine3 = (float) (iMul/(squaredVal3*cSquR));
		Float cosine4 = (float) (iMul/(squaredVal4*cSquR));
		Float cosine5 = (float) (iMul/(squaredVal5*cSquR));
		Float cosine6 = (float) (iMul/(squaredVal6*cSquR));
		Float cosine7 = (float) (iMul/(squaredVal7*cSquR));
		Float cosine8 = (float) (iMul/(squaredVal8*cSquR));
		Float cosine9 = (float) (iMul/(squaredVal9*cSquR));
		Float cosine10 = (float) (iMul/(squaredVal10*cSquR));
		System.out.println("Cosine Values: "+cosine1+" "+cosine2+" "+cosine3+" "+cosine4+" "+cosine5+" "+cosine6+" "+cosine7+" "+cosine8+" "+cosine9+" "+cosine10);
		List<Float> list = new ArrayList<Float>();
		list.add(cosine1);
		list.add(cosine2);
		list.add(cosine3);
		list.add(cosine4);
		list.add(cosine5);
		list.add(cosine6);
		list.add(cosine7);
		list.add(cosine8);
		list.add(cosine9);
		list.add(cosine10);
		int x = 0;
		int y = 0;
		for(Float val : list){
			if(val<=0.3){
				x = x+1;
			}else{
				y=y+1;
			}
		}
		if(x<y){
			System.out.println("NEGATIVE");
		}else{
			System.out.println("POSITIVE");
		}
	}

}
