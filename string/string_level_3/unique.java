public static void unique(String text){

    int freq[] = new int[256];

    for(int i=0;i<text.length();i++)
        freq[text.charAt(i)]++;

    for(int i=0;i<text.length();i++){

        char ch = text.charAt(i);

        if(freq[ch] != 0){
            System.out.println(ch+" : "+freq[ch]);
            freq[ch] = 0;
        }
    }
}