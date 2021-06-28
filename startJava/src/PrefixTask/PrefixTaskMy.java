package PrefixTask;

//task: "Find the same beginings of all strings in array"

class PrefixTaskMy {
    public static String prefix = "";

    public static void main(String[] args) {
        String[] task = { "task1", "task2", "task12113", "task123411" };

        prefix = PrefixOfComparedWords(task[0], task[1]);

        for (int i = 2; i < task.length; i++) {

            if (prefix == "") {
                System.out.println("No prefix of array strings!");
                break;
            }

            prefix = PrefixOfComparedWords(prefix, task[i]);

        }

        if (prefix != "")
            System.out.println(prefix);
    }

    public static String PrefixOfComparedWords(String firstWord, String secondWord) {
        String twoWordsPrefix = "";

        for (int j = 0; j < firstWord.length(); j++) {

            if (firstWord.charAt(j) != secondWord.charAt(j))
                break;

            twoWordsPrefix += firstWord.charAt(j);

        }

        return twoWordsPrefix;
    }
}