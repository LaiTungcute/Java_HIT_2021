package streamAPI;

import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class runMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //filter: lọc các phần tử thỏa mãn đk
        ArrayList res1 = (ArrayList) list.stream().filter((item) -> item %2==0).collect(Collectors.toList());
        System.out.println(res1);

        //Map: trả về 1 mảng giữ nguyên số lượng phần tử trong mảng và có thể thay đổi giá trị của phần tử đó
        System.out.println(list.stream().map(item -> item*2)
                .collect(Collectors.toList()));

        // skip: bỏ qua n phần tử đầu tiên

    }
}
