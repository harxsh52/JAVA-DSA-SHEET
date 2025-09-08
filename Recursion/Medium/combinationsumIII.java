package Medium;

import java.util.ArrayList;
import java.util.List;

public class combinationsumIII {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        generate(result, 0, n, k, new ArrayList<>());
        return result;
    }
    public void generate(List<List<Integer>> result, int index, int n, int k, List<Integer> currentList) {
        if (k == 0 && n == 0) {
            result.add(new ArrayList<>(currentList));
            return;
        }
        if (k < 0 || n < 0 || index >= candidates.length) {
            return;
        }
        currentList.add(candidates[index]);
        generate(result, index + 1, n - candidates[index], k - 1, currentList);
        currentList.remove(currentList.size() - 1);
        generate(result, index + 1, n, k, currentList);
    }
}
