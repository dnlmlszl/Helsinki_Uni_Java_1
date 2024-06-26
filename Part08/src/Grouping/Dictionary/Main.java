package Grouping.Dictionary;

public class Main {
    public static void main(String[] args) {
        DictionaryOfManyTranslations dictionary = new DictionaryOfManyTranslations();

        dictionary.add("lie", "maata");
        dictionary.add("lie", "valehdella");

        dictionary.add("bow", "jousi");
        dictionary.add("bow", "kumartaa");

        System.out.println(dictionary.translate("lie")); // Output: [maata, valehdella]
        dictionary.remove("bow");
        System.out.println(dictionary.translate("bow")); // Output: []

    }
}
