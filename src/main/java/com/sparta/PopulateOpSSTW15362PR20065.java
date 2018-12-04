package com.sparta;




public class PopulateOpSSTW15362PR20065{
	
	


	public String SearchOperationSingleSelection1(String input)
    {
    	  System.out.println("Inside search operation for Single selection - SearchOperationSingleSelection1 - SG ");
          
          String output = "";
          output += "<multivalue>";
          
          /*for(int i = 0; i < 5; i++){
        	  int j = i+1;
        	 
        	  output += "<value>OWS"+input+ "" + j+"</value>";
          }*/
          
          
          if(input.equalsIgnoreCase("1000*")){
              output += "<value>10000001</value>";
              output += "<value>10000002</value>";
              output += "<value>10000003</value>";
              output += "<value>10000004</value>";
          }
          else if(input.equalsIgnoreCase("1100*")){
              output += "<value>11001001</value>";
              output += "<value>11001002</value>";
              output += "<value>11001003</value>";
              output += "<value>11001004</value>";
          }
          else if(input.equalsIgnoreCase("1200*")){
              output += "<value>12002001</value>";
              output += "<value>12002002</value>";
              output += "<value>12002003</value>";
              output += "<value>12002004</value>";
          }
          else if(input.equalsIgnoreCase("*1001")){
              output += "<value>10000001</value>";
          }
          else if(input.equalsIgnoreCase("*2004")){
              output += "<value>12002004</value>";
          }
          
          else if(input.equalsIgnoreCase("*003")){
              output += "<value>10000003</value>";
              output += "<value>11001003</value>";
              output += "<value>12002003</value>";
          }
          else if(input.equalsIgnoreCase("*004")){
              output += "<value>10000004</value>";
              output += "<value>11001004</value>";
              output += "<value>12002004</value>";
          }          
          else if(input.equalsIgnoreCase("*00*")){
              output += "<value>10000001</value>";
              output += "<value>10000002</value>";
              output += "<value>10000003</value>";
              output += "<value>10000004</value>";
              output += "<value>11001001</value>";
              output += "<value>11001002</value>";
              output += "<value>11001003</value>";
              output += "<value>11001004</value>";
              output += "<value>12002001</value>";
              output += "<value>12002002</value>";
              output += "<value>12002003</value>";
              output += "<value>12002004</value>";
          }
          else if(input.equalsIgnoreCase("*") || input.equalsIgnoreCase("_") || input.equalsIgnoreCase("%")){
              output += "<value>10000001</value>";
              output += "<value>10000002</value>";
              output += "<value>10000003</value>";
              output += "<value>10000004</value>";
              output += "<value>11001001</value>";
              output += "<value>11001002</value>";
              output += "<value>11001003</value>";
              output += "<value>11001004</value>";
              output += "<value>12002001</value>";
              output += "<value>12002002</value>";
              output += "<value>12002003</value>";
              output += "<value>12002004</value>";
          }
          else if(input.equalsIgnoreCase("xyz")){
              output += "<value>SG*1_0%00</value>";
          }
          else if(input.equalsIgnoreCase("A")){
              output += "<value>   AUTG31ABC1 XYZ1</value>";
//output += "<value> AUTG31ABC1XYZ1</value>";
          }
          else if(input.equalsIgnoreCase("B")){
              output += "<value>BUTG31BABC2 XYZ2   </value>";
//output += "<value>BUTG31BABC2XYZ2 </value>";
          }
          else if(input.equalsIgnoreCase("C")){
              output += "<value>CUTG31CABC3   XYZ3</value>";
//output += "<value> CUTG31CABC3XYZ3 </value>";
          }
          else if(input.equalsIgnoreCase("D")){
              output += "<value>   DUTG31DABC4   XYZ4   </value>";
//output += "<value>DUTG31DABC4_XYZ4</value>";
          }
          else if(input.equalsIgnoreCase("E")){
              //////////////////########### output += "<value> EUTG31CABC3   XYZ3 </value>";
output += "<value>EUTG31CABC3 XYZ3</value>";
          }
          else if(input.equalsIgnoreCase("F")){
              output += "<value>   FUTG31DABC4   XYZ4   </value>";
//output += "<value> FUTG31DABC4 XYZ4 </value>";
          }
          else if(input.equalsIgnoreCase("Test Value 1")){
              output += "<value>   GUTG31DABC5   XYZ5   </value>";
          }
          else if(input.equalsIgnoreCase("Test Value 2")){
              output += "<value>   HUTG31DABC6   XYZ6</value>";
          }
          else {
              output += "<value>  "+input+"  "+11+"  </value>";
/////output += "<value>   HUTG31DABC6   XYZ6 11 </value>";
          }
          
          
        ///output += "<value>ABC   XYZ</value>";
                    
       /*   output += "<value>â€œaâ€�</value>";
          output += "<value>â€œa  â€œ</value>";
          output += "<value>â€œa     â€œ</value>";*/
          
          ////output += "<value>RG1~!@#$%^*()_+&<>1</value>";
          //////output += "<value>RG1~!@#$%^*()_+&>1</value>";
          
          ///output += "<value>Rudra & Ansh</value>";
          
          output += "</multivalue>";
          
          return output;
    }
	
	public String SearchOperationSingleSelection2(String input)
    {
          System.out.println("Inside search operation for Single selection - SearchOperationSingleSelection2  "+input);
          
          String output = "";
          output += "<multivalue>";
          
          /*for(int i = 0; i < 5; i++){
              int j = i+1;
             
              output += "<value>OWS"+input+ "" + j+"</value>";
          }*/
          
          
          if(input.equalsIgnoreCase("1000*")){
              output += "<value>10000001</value>";
              output += "<value>10000002</value>";
              output += "<value>10000003</value>";
              output += "<value>10000004</value>";
          }
          else if(input.equalsIgnoreCase("1100*")){
              output += "<value>11001001</value>";
              output += "<value>11001002</value>";
              output += "<value>11001003</value>";
              output += "<value>11001004</value>";
          }
          else if(input.equalsIgnoreCase("1200*")){
              output += "<value>12002001</value>";
              output += "<value>12002002</value>";
              output += "<value>12002003</value>";
              output += "<value>12002004</value>";
          }
          else if(input.equalsIgnoreCase("*1001")){
              output += "<value>10000001</value>";
          }
          else if(input.equalsIgnoreCase("*2004")){
              output += "<value>12002004</value>";
          }
          
          else if(input.equalsIgnoreCase("*003")){
              output += "<value>10000003</value>";
              output += "<value>11001003</value>";
              output += "<value>12002003</value>";
          }
          else if(input.equalsIgnoreCase("*004")){
              output += "<value>10000004</value>";
              output += "<value>11001004</value>";
              output += "<value>12002004</value>";
          }          
          else if(input.equalsIgnoreCase("*00*")){
              output += "<value>10000001</value>";
              output += "<value>10000002</value>";
              output += "<value>10000003</value>";
              output += "<value>10000004</value>";
              output += "<value>11001001</value>";
              output += "<value>11001002</value>";
              output += "<value>11001003</value>";
              output += "<value>11001004</value>";
              output += "<value>12002001</value>";
              output += "<value>12002002</value>";
              output += "<value>12002003</value>";
              output += "<value>12002004</value>";
          }
          else if(input.equalsIgnoreCase("*") || input.equalsIgnoreCase("_") || input.equalsIgnoreCase("%")){
              output += "<value>10000001</value>";
              output += "<value>10000002</value>";
              output += "<value>10000003</value>";
              output += "<value>10000004</value>";
              output += "<value>11001001</value>";
              output += "<value>11001002</value>";
              output += "<value>11001003</value>";
              output += "<value>11001004</value>";
              output += "<value>12002001</value>";
              output += "<value>12002002</value>";
              output += "<value>12002003</value>";
              output += "<value>12002004</value>";
          }
          else if(input.equalsIgnoreCase("xyz")){
              output += "<value>SG*1_0%00</value>";
          }
          /*else if(input.equalsIgnoreCase("A")){
              output += "<value>ABC XYZ</value>";
          }
          else if(input.equalsIgnoreCase("B")){
              //output += "<value>ABC XYZ</value>";
              output += "&lt;value>MILLIP00000023956211||&lt;/value>";
          }
          else if(input.equalsIgnoreCase("C")){
              //output += "<value>ABC XYZ</value>";
              output += "&lt;value>00000000000000000001|PHOENX00000110637090|PHOENX000000001051011000|DI-POTASSIUM HYDROGEN PHOSPHATE ANHYDROU&lt;/value>";
          }*/
          
          else if(input.equalsIgnoreCase("xyz")){
              output += "<value>SG*1_0%00</value>";
          }
          else if(input.equalsIgnoreCase("A")){
              output += "<value>   AUTG32ABC1 XYZ1</value>";
          }
          else if(input.equalsIgnoreCase("B")){
              
              output += "<value>BUTG32BABC2 XYZ2   </value>";
          }
          else if(input.equalsIgnoreCase("C")){
              output += "<value>CUTG32CABC3   XYZ3</value>";
          }
          else if(input.equalsIgnoreCase("D")){
              output += "<value>   DUTG32DABC4   XYZ4   </value>";
          }
          else if(input.equalsIgnoreCase("E")){
              output += "<value> EUTG32CABC3   XYZ3 </value>";
          }
          else if(input.equalsIgnoreCase("F")){
              output += "<value>   FUTG32DABC4   XYZ4   </value>";
          }
          else if(input.equalsIgnoreCase("Test Value 1")){
              output += "<value>   GUTG31DABC5   XYZ5   </value>";
          }
          else if(input.equalsIgnoreCase("Test Value 2")){
              output += "<value>   HUTG31DABC6   XYZ6</value>";
          }
          else {
              output += "<value>  "+input+"  "+12+"  </value>";
/////output += "<value>   HUTG31DABC6   XYZ6 11 </value>";
          }
          
          //output += "<value>SG1~!@#$%^*()_+&<>1</value>";
          ////output += "<value>SG1~!@#$%^*()_+&1</value>";
        ///  output += "<value>JohnSon & JohnSon</value>";
          
          output += "</multivalue>";
          
          return output;
    }
	
	public String SearchOperationSingleSelection3(String input)
    {
          System.out.println("Inside search operation for Single selection - SearchOperationSingleSelection3  ");
          
          String output = "";
          output += "<multivalue>";
          
          /*for(int i = 0; i < 5; i++){
              int j = i+1;
             
              output += "<value>OWS"+input+ "" + j+"</value>";
          }*/
          
          
          if(input.equalsIgnoreCase("1000*")){
              output += "<value>10000001</value>";
              output += "<value>10000002</value>";
              output += "<value>10000003</value>";
              output += "<value>10000004</value>";
          }
          else if(input.equalsIgnoreCase("1100*")){
              output += "<value>11001001</value>";
              output += "<value>11001002</value>";
              output += "<value>11001003</value>";
              output += "<value>11001004</value>";
          }
          else if(input.equalsIgnoreCase("1200*")){
              output += "<value>12002001</value>";
              output += "<value>12002002</value>";
              output += "<value>12002003</value>";
              output += "<value>12002004</value>";
          }
          else if(input.equalsIgnoreCase("*1001")){
              output += "<value>10000001</value>";
          }
          else if(input.equalsIgnoreCase("*2004")){
              output += "<value>12002004</value>";
          }
          
          else if(input.equalsIgnoreCase("*003")){
              output += "<value>10000003</value>";
              output += "<value>11001003</value>";
              output += "<value>12002003</value>";
          }
          else if(input.equalsIgnoreCase("*004")){
              output += "<value>10000004</value>";
              output += "<value>11001004</value>";
              output += "<value>12002004</value>";
          }          
          else if(input.equalsIgnoreCase("*00*")){
              output += "<value>10000001</value>";
              output += "<value>10000002</value>";
              output += "<value>10000003</value>";
              output += "<value>10000004</value>";
              output += "<value>11001001</value>";
              output += "<value>11001002</value>";
              output += "<value>11001003</value>";
              output += "<value>11001004</value>";
              output += "<value>12002001</value>";
              output += "<value>12002002</value>";
              output += "<value>12002003</value>";
              output += "<value>12002004</value>";
          }
          else if(input.equalsIgnoreCase("*") || input.equalsIgnoreCase("_") || input.equalsIgnoreCase("%")){
              output += "<value>10000001</value>";
              output += "<value>10000002</value>";
              output += "<value>10000003</value>";
              output += "<value>10000004</value>";
              output += "<value>11001001</value>";
              output += "<value>11001002</value>";
              output += "<value>11001003</value>";
              output += "<value>11001004</value>";
              output += "<value>12002001</value>";
              output += "<value>12002002</value>";
              output += "<value>12002003</value>";
              output += "<value>12002004</value>";
          }
          else if(input.equalsIgnoreCase("xyz")){
              output += "<value>SG*1_0%00</value>";
          }
          /*else if(input.equalsIgnoreCase("A")){
              output += "<value>ABC XYZ</value>";
          }
          else if(input.equalsIgnoreCase("B")){
              //output += "<value>ABC XYZ</value>";
              output += "&lt;value>MILLIP00000023956211||&lt;/value>";
          }
          else if(input.equalsIgnoreCase("C")){
              //output += "<value>ABC XYZ</value>";
              output += "&lt;value>00000000000000000001|PHOENX00000110637090|PHOENX000000001051011000|DI-POTASSIUM HYDROGEN PHOSPHATE ANHYDROU&lt;/value>";
          }*/
          
          else if(input.equalsIgnoreCase("xyz")){
              output += "<value>SG*1_0%00</value>";
          }
          else if(input.equalsIgnoreCase("A")){
              output += "<value>   AUTG332ABC1 XYZ1</value>";
//output += "<value> AUTG332ABC1XYZ1</value>";
          }
          else if(input.equalsIgnoreCase("B")){
              output += "<value>BUTG332BABC2 XYZ2   </value>";
//output += "<value>BUTG332BABC2XYZ2 </value>";
          }
          else if(input.equalsIgnoreCase("C")){
              output += "<value>CUTG332CABC3   XYZ3</value>";
//output += "<value> CUTG332CABC3XYZ3 </value>";
          }
          else if(input.equalsIgnoreCase("D")){
              output += "<value>   DUTG332DABC4   XYZ4   </value>";
//output += "<value>DUTG332DABC4_XYZ4</value>";
          }
          else if(input.equalsIgnoreCase("E")){
              //////////////////########### output += "<value> EUTG332CABC3   XYZ3 </value>";
output += "<value>EUTG332CABC3 XYZ3</value>";
          }
          else if(input.equalsIgnoreCase("F")){
              output += "<value>   FUTG332DABC4   XYZ4   </value>";
//output += "<value> FUTG332DABC4 XYZ4 </value>";
          }
          else if(input.equalsIgnoreCase("Test Value 1")){
              output += "<value>   GUTG31DABC5   XYZ5   </value>";
          }
          else if(input.equalsIgnoreCase("Test Value 2")){
              output += "<value>   HUTG31DABC6   XYZ6</value>";
          }
          else {
              output += "<value>  "+input+"  "+13+"  </value>";
/////output += "<value>   HUTG31DABC6   XYZ6 13 </value>";
          }
          
          //output += "<value>SG1~!@#$%^*()_+&<>1</value>";
          ////output += "<value>SG1~!@#$%^*()_+&1</value>";]
        ///  output += "<value>JohnSon & JohnSon</value>";
          
          output += "</multivalue>";
          
          return output;
    }
    
	public String SearchOperationSingleSelection1ForGrid(String input)
    {
          System.out.println("Inside search operation for Single selection - SearchOperationSingleSelection1ForGrid - SG ");
          
          String output = "";
          output += "<multivalue>";
          
          /*for(int i = 0; i < 5; i++){
              int j = i+1;
             
              output += "<value>OWS"+input+ "" + j+"</value>";
          }*/
          
          
          if(input.equalsIgnoreCase("1000*")){
              output += "<value>10000001</value>";
              output += "<value>10000002</value>";
              output += "<value>10000003</value>";
              output += "<value>10000004</value>";
          }
          else if(input.equalsIgnoreCase("1100*")){
              output += "<value>11001001</value>";
              output += "<value>11001002</value>";
              output += "<value>11001003</value>";
              output += "<value>11001004</value>";
          }
          else if(input.equalsIgnoreCase("1200*")){
              output += "<value>12002001</value>";
              output += "<value>12002002</value>";
              output += "<value>12002003</value>";
              output += "<value>12002004</value>";
          }
          else if(input.equalsIgnoreCase("*1001")){
              output += "<value>10000001</value>";
          }
          else if(input.equalsIgnoreCase("*2004")){
              output += "<value>12002004</value>";
          }
          
          else if(input.equalsIgnoreCase("*003")){
              output += "<value>10000003</value>";
              output += "<value>11001003</value>";
              output += "<value>12002003</value>";
          }
          else if(input.equalsIgnoreCase("*004")){
              output += "<value>10000004</value>";
              output += "<value>11001004</value>";
              output += "<value>12002004</value>";
          }          
          else if(input.equalsIgnoreCase("*00*")){
              output += "<value>10000001</value>";
              output += "<value>10000002</value>";
              output += "<value>10000003</value>";
              output += "<value>10000004</value>";
              output += "<value>11001001</value>";
              output += "<value>11001002</value>";
              output += "<value>11001003</value>";
              output += "<value>11001004</value>";
              output += "<value>12002001</value>";
              output += "<value>12002002</value>";
              output += "<value>12002003</value>";
              output += "<value>12002004</value>";
          }
          else if(input.equalsIgnoreCase("*") || input.equalsIgnoreCase("_") || input.equalsIgnoreCase("%")){
              output += "<value>10000001</value>";
              output += "<value>10000002</value>";
              output += "<value>10000003</value>";
              output += "<value>10000004</value>";
              output += "<value>11001001</value>";
              output += "<value>11001002</value>";
              output += "<value>11001003</value>";
              output += "<value>11001004</value>";
              output += "<value>12002001</value>";
              output += "<value>12002002</value>";
              output += "<value>12002003</value>";
              output += "<value>12002004</value>";
          }
          else if(input.equalsIgnoreCase("xyz")){
              output += "<value>SG*1_0%00</value>";
          }
          else if(input.equalsIgnoreCase("A")){
              output += "<value>   AUTG31ABC1 XYZ1</value>";
          /////output += "<value>AUTG31ABC1_XYZ1</value>";
          }
          else if(input.equalsIgnoreCase("B")){
              output += "<value>BUTG31BABC2 XYZ2   </value>";
          /////output += "<value>BUTG31BABC2 XYZ2</value>";
          }
          else if(input.equalsIgnoreCase("C")){
              output += "<value>CUTG31CABC3   XYZ3</value>";
          /////output += "<value>CUTG31CABC3 XYZ3</value>";
          }
          else if(input.equalsIgnoreCase("D")){
              output += "<value>   DUTG31DABC4   XYZ4   </value>";
          /////output += "<value>DUTG31DABC4 XYZ4</value>";
          }
          else if(input.equalsIgnoreCase("E")){
              //////////////////########### output += "<value> EUTG31CABC3   XYZ3 </value>";
output += "<value>EUTG31CABC3 XYZ3</value>";
          }
          else if(input.equalsIgnoreCase("F")){
              output += "<value>   FUTG31DABC4   XYZ4   </value>";
          }
          else if(input.equalsIgnoreCase("Test Value 1")){
              output += "<value>   GUTG31DABC5   XYZ5   </value>";
          }
          else if(input.equalsIgnoreCase("Test Value 2")){
              output += "<value>   HUTG31DABC6   XYZ6</value>";
          }
          /*else {
              output += "<value>Test Value</value>";
          }*/
          
          else {
              ////////////////////////////////////////output += "<value>  "+input+"  "+111+"  </value>";
////output += "<value>   HUTG31DABC6   XYZ6 11 </value>";
              
              int j = 0+1;
              output += "<value>Pradeep Gowda</value><value>Test Value</value><value>  "+input+"  "+j+1+"  </value><value>"+input+""+j+"</value><value>"+input+"  "+j+1+"  </value><value>  "+input+"  "+j+2+"</value><value>"+"NoSpace"+"</value>";

          }
          
        ///output += "<value>ABC   XYZ</value>";
                    
       /*   output += "<value>â€œaâ€�</value>";
          output += "<value>â€œa  â€œ</value>";
          output += "<value>â€œa     â€œ</value>";*/
          
          ////output += "<value>RG1~!@#$%^*()_+&<>1</value>";
          //////output += "<value>RG1~!@#$%^*()_+&>1</value>";
          
          ///output += "<value>Rudra & Ansh</value>";
          
          output += "</multivalue>";
          
          return output;
    }
    
    public String SearchOperationSingleSelection2ForGrid(String input)
    {
          System.out.println("Inside search operation for Single selection - SearchOperationSingleSelection2ForGrid  ");
          
          String output = "";
          output += "<multivalue>";
          
          /*for(int i = 0; i < 5; i++){
              int j = i+1;
             
              output += "<value>OWS"+input+ "" + j+"</value>";
          }*/
          
          
          if(input.equalsIgnoreCase("1000*")){
              output += "<value>10000001</value>";
              output += "<value>10000002</value>";
              output += "<value>10000003</value>";
              output += "<value>10000004</value>";
          }
          else if(input.equalsIgnoreCase("1100*")){
              output += "<value>11001001</value>";
              output += "<value>11001002</value>";
              output += "<value>11001003</value>";
              output += "<value>11001004</value>";
          }
          else if(input.equalsIgnoreCase("1200*")){
              output += "<value>12002001</value>";
              output += "<value>12002002</value>";
              output += "<value>12002003</value>";
              output += "<value>12002004</value>";
          }
          else if(input.equalsIgnoreCase("*1001")){
              output += "<value>10000001</value>";
          }
          else if(input.equalsIgnoreCase("*2004")){
              output += "<value>12002004</value>";
          }
          
          else if(input.equalsIgnoreCase("*003")){
              output += "<value>10000003</value>";
              output += "<value>11001003</value>";
              output += "<value>12002003</value>";
          }
          else if(input.equalsIgnoreCase("*004")){
              output += "<value>10000004</value>";
              output += "<value>11001004</value>";
              output += "<value>12002004</value>";
          }          
          else if(input.equalsIgnoreCase("*00*")){
              output += "<value>10000001</value>";
              output += "<value>10000002</value>";
              output += "<value>10000003</value>";
              output += "<value>10000004</value>";
              output += "<value>11001001</value>";
              output += "<value>11001002</value>";
              output += "<value>11001003</value>";
              output += "<value>11001004</value>";
              output += "<value>12002001</value>";
              output += "<value>12002002</value>";
              output += "<value>12002003</value>";
              output += "<value>12002004</value>";
          }
          else if(input.equalsIgnoreCase("*") || input.equalsIgnoreCase("_") || input.equalsIgnoreCase("%")){
              output += "<value>10000001</value>";
              output += "<value>10000002</value>";
              output += "<value>10000003</value>";
              output += "<value>10000004</value>";
              output += "<value>11001001</value>";
              output += "<value>11001002</value>";
              output += "<value>11001003</value>";
              output += "<value>11001004</value>";
              output += "<value>12002001</value>";
              output += "<value>12002002</value>";
              output += "<value>12002003</value>";
              output += "<value>12002004</value>";
          }
          else if(input.equalsIgnoreCase("xyz")){
              output += "<value>SG*1_0%00</value>";
          }
          /*else if(input.equalsIgnoreCase("A")){
              output += "<value>ABC XYZ</value>";
          }
          else if(input.equalsIgnoreCase("B")){
              //output += "<value>ABC XYZ</value>";
              output += "&lt;value>MILLIP00000023956211||&lt;/value>";
          }
          else if(input.equalsIgnoreCase("C")){
              //output += "<value>ABC XYZ</value>";
              output += "&lt;value>00000000000000000001|PHOENX00000110637090|PHOENX000000001051011000|DI-POTASSIUM HYDROGEN PHOSPHATE ANHYDROU&lt;/value>";
          }*/
          
          else if(input.equalsIgnoreCase("xyz")){
              output += "<value>SG*1_0%00</value>";
          }
          else if(input.equalsIgnoreCase("A")){
              output += "<value>   AUTG32ABC1 XYZ1</value>";
          /////output += "<value>AUTG32ABC1_XYZ1</value>";
          }
          else if(input.equalsIgnoreCase("B")){
              output += "<value>BUTG32BABC2 XYZ2   </value>";
          /////output += "<value>BUTG32BABC2 XYZ2</value>";
          }
          else if(input.equalsIgnoreCase("C")){
              output += "<value>CUTG32CABC3   XYZ3</value>";
          /////output += "<value>CUTG32CABC3 XYZ3</value>";
          }
          else if(input.equalsIgnoreCase("D")){
              output += "<value>   DUTG32DABC4   XYZ4   </value>";
            /////output += "<value>DUTG32DABC4 XYZ4</value>";
          }
          else if(input.equalsIgnoreCase("E")){
              output += "<value> EUTG32CABC3   XYZ3 </value>";
          }
          else if(input.equalsIgnoreCase("F")){
              output += "<value>   FUTG32DABC4   XYZ4   </value>";
          }
          else if(input.equalsIgnoreCase("Test Value 1")){
              output += "<value>   GUTG31DABC5   XYZ5   </value>";
          }
          else if(input.equalsIgnoreCase("Test Value 2")){
              output += "<value>   HUTG31DABC6   XYZ6</value>";
          }
          else {
              //////////output += "<value>  "+input+"  "+11+"  </value>";
output += "<value>   HUTG31DABC6   XYZ6 15 </value>";
          }
          
          //output += "<value>SG1~!@#$%^*()_+&<>1</value>";
          ////output += "<value>SG1~!@#$%^*()_+&1</value>";
        ///  output += "<value>JohnSon & JohnSon</value>";
          
          output += "</multivalue>";
          
          return output;
    }
    
    public String SearchOperationSingleSelection3ForGrid(String input)
    {
          System.out.println("Inside search operation for Single selection - SearchOperationSingleSelection3ForGrid  ");
          
          String output = "";
          output += "<multivalue>";
          
          /*for(int i = 0; i < 5; i++){
              int j = i+1;
             
              output += "<value>OWS"+input+ "" + j+"</value>";
          }*/
          
          
          if(input.equalsIgnoreCase("1000*")){
              output += "<value>10000001</value>";
              output += "<value>10000002</value>";
              output += "<value>10000003</value>";
              output += "<value>10000004</value>";
          }
          else if(input.equalsIgnoreCase("1100*")){
              output += "<value>11001001</value>";
              output += "<value>11001002</value>";
              output += "<value>11001003</value>";
              output += "<value>11001004</value>";
          }
          else if(input.equalsIgnoreCase("1200*")){
              output += "<value>12002001</value>";
              output += "<value>12002002</value>";
              output += "<value>12002003</value>";
              output += "<value>12002004</value>";
          }
          else if(input.equalsIgnoreCase("*1001")){
              output += "<value>10000001</value>";
          }
          else if(input.equalsIgnoreCase("*2004")){
              output += "<value>12002004</value>";
          }
          
          else if(input.equalsIgnoreCase("*003")){
              output += "<value>10000003</value>";
              output += "<value>11001003</value>";
              output += "<value>12002003</value>";
          }
          else if(input.equalsIgnoreCase("*004")){
              output += "<value>10000004</value>";
              output += "<value>11001004</value>";
              output += "<value>12002004</value>";
          }          
          else if(input.equalsIgnoreCase("*00*")){
              output += "<value>10000001</value>";
              output += "<value>10000002</value>";
              output += "<value>10000003</value>";
              output += "<value>10000004</value>";
              output += "<value>11001001</value>";
              output += "<value>11001002</value>";
              output += "<value>11001003</value>";
              output += "<value>11001004</value>";
              output += "<value>12002001</value>";
              output += "<value>12002002</value>";
              output += "<value>12002003</value>";
              output += "<value>12002004</value>";
          }
          else if(input.equalsIgnoreCase("*") || input.equalsIgnoreCase("_") || input.equalsIgnoreCase("%")){
              output += "<value>10000001</value>";
              output += "<value>10000002</value>";
              output += "<value>10000003</value>";
              output += "<value>10000004</value>";
              output += "<value>11001001</value>";
              output += "<value>11001002</value>";
              output += "<value>11001003</value>";
              output += "<value>11001004</value>";
              output += "<value>12002001</value>";
              output += "<value>12002002</value>";
              output += "<value>12002003</value>";
              output += "<value>12002004</value>";
          }
          else if(input.equalsIgnoreCase("xyz")){
              output += "<value>SG*1_0%00</value>";
          }
          
          else if(input.equalsIgnoreCase("xyz")){
              output += "<value>SG*1_0%00</value>";
          }
          else if(input.equalsIgnoreCase("A")){
              output += "<value>   AUTG332ABC1 XYZ1</value>";
          /////output += "<value>AUTG332ABC1_XYZ1</value>";
          }
          else if(input.equalsIgnoreCase("B")){
              output += "<value>BUTG332BABC2 XYZ2   </value>";
          /////output += "<value>BUTG332BABC2 XYZ2</value>";
          }
          else if(input.equalsIgnoreCase("C")){
              output += "<value>CUTG332CABC3   XYZ3</value>";
          /////output += "<value>CUTG332CABC3 XYZ3</value>";
          }
          else if(input.equalsIgnoreCase("D")){
              output += "<value>   DUTG332DABC4   XYZ4   </value>";
          /////output += "<value>DUTG332DABC4 XYZ4</value>";
          }
          else if(input.equalsIgnoreCase("E")){
              //////////////////########### output += "<value> EUTG332CABC3   XYZ3 </value>";
output += "<value>EUTG332CABC3 XYZ3</value>";

          }
          else if(input.equalsIgnoreCase("F")){
              output += "<value>   FUTG332DABC4   XYZ4   </value>";
          }
          else if(input.equalsIgnoreCase("Test Value 1")){
              output += "<value>   GUTG31DABC5   XYZ5   </value>";
          }
          else if(input.equalsIgnoreCase("Test Value 2")){
              output += "<value>   HUTG31DABC6   XYZ6</value>";
          }
          else {
              output += "<value>  "+input+"  "+119+"  </value>";

          }
          
         
          output += "</multivalue>";
          
          return output;
    }
	
    public String SearchOrPopulateOperation1(String input)
    {          
    	System.out.println("Inside SearchOrPopulateOperation1 :"+ input);
          String output = "";
          output += "<multivalue>";
          output += "<value></value>";
          output += "</multivalue>";
          
          System.out.println("End of SearchOrPopulateOperation1 :"+ output);
          
          return output;
    }
    public String SearchOrPopulateOperation2(String input)
    {   
    	System.out.println("Inside SearchOrPopulateOperation2 :"+ input);
    	
    	String output = "";
    	
    	if(!input.isEmpty()&& 
		  (input.equalsIgnoreCase("TW23792-SS-TD-IN-SV1"))){
			  output += "<multivalue>";
              output += "<value>" + input + " - SR</value>";
              output += "</multivalue>";
		  }else	 {
	          output += "<multivalue>";
	          output += "<value></value>";
	          output += "</multivalue>";
	     }
          
    	 System.out.println("End of SearchOrPopulateOperation2:"+ output);          
          
          return output;
    }
    public String SearchOrPopulateOperation3(String input)
    {          
    	System.out.println("Inside SearchOrPopulateOperation3 :"+ input);
          String output = "";
          
          if(!input.isEmpty() && 
        		  (input.equalsIgnoreCase("ssinputdd1") || 
        				  input.equalsIgnoreCase("ssinputdd2")|| input.equalsIgnoreCase("TW23792-SS-DD-IN-SV1"))){
        	  output += "<multivalue>";
              output += "<value>" + input + " - SR</value>";
              output += "</multivalue>";
          }else{
        	  output += "<multivalue>";
              output += "<value></value>";
              output += "</multivalue>";  
          }
          
          
          System.out.println("End of SearchOrPopulateOperation3 :"+ output);
          
          return output;
    }
    
    public String dataTimeInput(String input)
    {          
    	System.out.println("Inside DatetimeInput :"+ input);
          String output = "";
          output += "<multivalue>";
          output += "<value></value>";
          output += "</multivalue>";
          
          System.out.println("End of DatetimeInput :"+ output);
          
          return output;
    }
    
    public String SearchOrPopulateOperation5(String input)
    {      String value1 = "";
        String value2 = "";

	if (input.equals("A1")) {
		value1 = "A1";
	} else if (input.equals("2")) {
		value1 = "2";
	}
	System.out.println("Populate operation for Selection Grid");
	String output1 = "<![CDATA[<gridfield><replace>false</replace>";
	String row = "";
	row += "<row>"
			+ "<column>"
				+ "<name>SS1</name>"
					+ "<value>"+value1+"</value>"
					+ "<type>Select</type>"
			+ "</column>"
		+ "</row>"
		+ "<row>"
			+ "<column>"
				+ "<name>SS2</name>"
				+ "<value>"+value1+"</value>"
				+ "<type>Select</type>"
			+ "</column>"
		+ "</row>";
	String output = output1 + row + "</gridfield>]]>";
	System.out.println(output);
          
          return output;
    }
	
    
	
		 
}