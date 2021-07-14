package thirteenJulyTwentyOne;

public class Strings {
    public static void main(String[] args){
        // length, substring, contains, equals, isEmpty, concat, replace, split
        String name = "Rushikesh Gaikwad";
        String name0 = "Rushikesh";
        String emp = "";
        String name1 = "Rushikesh";
        String otherName = new String("Rushikesh");
        System.out.println(name);
        System.out.println(otherName);
        System.out.println(name0 == name1);
        System.out.println(name0 == otherName);
        System.out.println(name.length());
        System.out.println(name.substring(5));
        System.out.println(name.substring(0, 5));
        System.out.println(name.contains("Rushi"));
        System.out.println(name0.equals(name1));
        System.out.println(name0.equals(otherName));
        System.out.println(emp.isEmpty());
        System.out.println(name.isEmpty());
        name0 += " Gaikwad";
        System.out.println(name0);
        System.out.println(name0.concat(" Rajkumar"));
        System.out.println(name0);
        System.out.println(name0.replace("a", ""));
        System.out.println((name0.concat(" Rajkumar")).replace("a", "A"));
        String names[] = name0.split(" ");
        for(String e: names){
            System.out.println(e + ",");
        }
        System.out.println(name0.indexOf("Ru"));
        System.out.println(name0.indexOf("Rufasd"));
        System.out.println(name0.toLowerCase());
        System.out.println(name0.toUpperCase());
        name1 = "   Rushikesh   Gaikwad   ";
        System.out.println(name1);
        System.out.println(name1.trim());


    }
}
