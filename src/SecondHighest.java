//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    List<Integer> elements = Arrays.asList(1, 2, 45, 23, 567, 890);
    var secondHighest = elements.stream().distinct().
            sorted(Collections.reverseOrder()).
            skip(1).findFirst();
    System.out.println(secondHighest.get());
}
