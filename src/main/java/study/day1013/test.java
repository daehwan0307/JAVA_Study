package study.day1013;

public class test {
    public static void main(String[] args) {
        String[] strs = new String[]{"�Ҿư�","����","ġ��"};


        String a = "�Ҿư�������";
        String b = "";
        for(String str : strs){
            if(a.contains(str)) {
                b = str;
            }else
                b = "??";
        }
        System.out.println(b);
    }
}
