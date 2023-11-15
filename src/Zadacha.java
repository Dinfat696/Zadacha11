import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Zadacha {
    public static void main(String[] args) {
        String[] array = {"Май", "Июнь", "Май", "Июль", "Май"};
        Set<String> unigueSet = new HashSet<>();
        List<String> uniqueList = new ArrayList<>();
        for (String str : array) {
            if (unigueSet.add(str)) {
                uniqueList.add(str);
            }
        }

        StringBuilder result = new StringBuilder();
        for (String str : uniqueList) {
            result.append(str).append(" ");

        }
        System.out.println(result.toString());
    }
}
