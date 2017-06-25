class Q6 {
    public static void main(String [] args) {
        String[] numbers = new String[30];
        int number = 1234;
           numbers[0] = "zero";
           numbers[1] = "one";
           numbers[2] = "two";
           numbers[3] = "three";
           numbers[4] = "four";
           numbers[5] = "five";
           numbers[6] = "six";
           numbers[7] = "seven";
           numbers[8] = "eight";
           numbers[9] = "nine";
           numbers[10] = "ten";
           numbers[11] = "eleven";
           numbers[12] = "twelve";
           numbers[13] = "thirteen";
           numbers[14] = "fourteen";
           numbers[15] = "fifteen";
           numbers[16] = "sixtenn";
           numbers[17] = "seventeen";
           numbers[18] = "eighteen";
           numbers[19] = "nineteen";
           numbers[20] = "twenty";
           numbers[21] = "thirty";
           numbers[22] = "forty";
           numbers[23] = "fifty";
           numbers[24] = "sixty";
           numbers[25] = "seventy";
           numbers[26] = "eighty";
           numbers[27] = "ninety";
           numbers[28] = "hundred";
           numbers[29] = "million";

           int num_m = number/1000000;
           int num_t = (number%1000000)/1000;
           int num_h = (number%1000);

           //million

           if(num_m > 0 ) {
                if(num_m%100 > 0) {
                    
                    if(num_m/100 > 0) {
                        System.out.print( numbers[num_m/100] + " " + numbers[28] + " " );                        
                    }

                    if(num_m%100 >= 20 && num_m%100 <100) {

                        if((num_m%100)/10 == 2) {
                            System.out.print( numbers[20] + " " );
                        } else if((num_m%100)/10 == 3) {
                            System.out.print( numbers[21] + " " );
                        } else if((num_m%100)/10 == 4) {
                            System.out.print( numbers[22] + " " );
                        } else if((num_m%100)/10 == 5) {
                            System.out.print( numbers[23] + " " );
                        } else if((num_m%100)/10 == 6) {
                            System.out.print( numbers[24] + " " );
                        } else if((num_m%100)/10 == 7) {
                            System.out.print( numbers[25] + " " );
                        } else if((num_m%100)/10 == 8) {
                            System.out.print( numbers[26] + " " );
                        } else if((num_m%100)/10 == 9) {
                            System.out.print( numbers[27] + " " );
                        } 
                        
                        if((num_m%10) > 0) {
                            System.out.print( numbers[(num_m%10)] + " " );
                        }

                    } else {
                        System.out.print( numbers[(num_m%100)] + " " );
                    }   

                    System.out.print( numbers[29] + " " );

                }
           }

           //thousand

           if(num_t > 0 ) {
                if(num_t%100 > 0) {
                    
                    if(num_t/100 > 0) {
                        System.out.print( numbers[num_t/100] + " " + numbers[28] + " " );                        
                    }
                    if(num_t%100 >= 20 && num_t%100 <100) {

                        if((num_t%100)/10 == 2) {
                            System.out.print( numbers[20] + " " );
                        } else if((num_t%100)/10 == 3) {
                            System.out.print( numbers[21] + " " );
                        } else if((num_t%100)/10 == 4) {
                            System.out.print( numbers[22] + " " );
                        } else if((num_t%100)/10 == 5) {
                            System.out.print( numbers[23] + " " );
                        } else if((num_t%100)/10 == 6) {
                            System.out.print( numbers[24] + " " );
                        } else if((num_t%100)/10 == 7) {
                            System.out.print( numbers[25] + " " );
                        } else if((num_t%100)/10 == 8) {
                            System.out.print( numbers[26] + " " );
                        } else if((num_t%100)/10 == 9) {
                            System.out.print( numbers[27] + " " );
                        } 
                        
                        if((num_t%10) > 0) {
                            System.out.print( numbers[(num_t%10)] + " " );
                        }

                    } else {
                        System.out.print( numbers[(num_t%100)] + " " );
                    }
                    
                    System.out.print("thousand" + " " );

                }
           }

           //hundred
           if(num_h > 0 ) {
                if(num_h%100 > 0) {
                    
                    if(num_h/100 > 0) {
                        System.out.print( numbers[num_h/100] + " " + numbers[28] + " " );                        
                    }
                    if(num_h%100 >= 20 && num_h%100 <100) {

                        if((num_h%100)/10 == 2) {
                            System.out.print( numbers[20]  + " " );
                        } else if((num_h%100)/10 == 3) {
                            System.out.print( numbers[21] + " " );
                        } else if((num_h%100)/10 == 4) {
                            System.out.print( numbers[22] + " " );
                        } else if((num_h%100)/10 == 5) {
                            System.out.print( numbers[23] + " " );
                        } else if((num_h%100)/10 == 6) {
                            System.out.print( numbers[24] + " " );
                        } else if((num_h%100)/10 == 7) {
                            System.out.print( numbers[25] + " " );
                        } else if((num_h%100)/10 == 8) {
                            System.out.print( numbers[26] + " " );
                        } else if((num_h%100)/10 == 9) {
                            System.out.print( numbers[27] + " " );
                        } 
                        
                        if((num_h%10) > 0) {
                            System.out.print( numbers[(num_h%10)] + " " );
                        }

                    } else {
                        System.out.print( numbers[(num_h%100)]);
                    }
                    
                }
           }
           if(number==0) {
                System.out.print( numbers[0]);               
           }

    }
}