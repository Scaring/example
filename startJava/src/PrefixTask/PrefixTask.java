package PrefixTask;

class PrefixTask {
    public static String prefix = "";

    public static void main(String[] args) {
        String[] task = { "task1", "task2", "task12113", "task123411" };

        for (int i = 0; i < task.length; i++) {
            if (i == (task.length - 1))
                break;

            String curPrefix = "";
            String curentWord = task[i];
            String nextWord = task[i + 1];
            // System.out.println("Curent " + curentWord + " and next " + nextWord);

            for (int j = 0; j < curentWord.length(); j++) {
                if (curentWord.charAt(j) != nextWord.charAt(j))
                    break;
                if (curentWord.charAt(j) == nextWord.charAt(j))
                    curPrefix += curentWord.charAt(j);
            }

            if (!prefix.equals("") || prefix.equals(curPrefix))
                break;

            prefix = curPrefix;
        }

        System.out.println(prefix);
    }
}