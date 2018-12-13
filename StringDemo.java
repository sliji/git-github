class StringDemo{

    public static void main(String args[]){
        String str="HELLO guys...";
        System.out.println("The String is:" + str);
        System.out.println("Length of the String is:" +str.length());
        System.out.println("Character at specified position:"+ str.charAt(4));
        System.out.println("Substring of the String is:"+str.substring(6,10));
        System.out.println("Index of the specified character:"+ str.indexOf("g"));
        System.out.println("conversion to uppercase:" +str.toUpperCase());
        System.out.println("conversion to uppercase:" +str.toLowerCase());
    }

}

