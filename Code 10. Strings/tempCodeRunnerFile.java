public static String stringsub(String name, int a, int b){
        String str = "";
        for(int i=a; i<b; i++){
            str+=name.charAt(i);
        }
        return str;
    }