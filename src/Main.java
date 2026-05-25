void main() {
    // Task1
    System.out.println("\n- Task1");
    Task1 oddNames = new Task1();
    List<String> names = Arrays.asList("Ivan", "Peter", "Trifon", "Andrii", "Anbtu", "Sviatik");
    System.out.println(oddNames.getOddNames(names));

    // Task2
    System.out.println("\n- Task2");
    Task2 getSortedNames = new Task2();
    List<String> names2 = Arrays.asList("Ivan", "Peter", "Trifon", "Andrii", "Anbtu", "Sviatik");
    System.out.println(getSortedNames.getSortedNames(names2));

    // Task3
    System.out.println("\n- Task3");
    Task3 getSortedNums = new Task3();
    List<String> nums = List.of(new String[]{"1, 2, 0", "4, 5"});
    System.out.println("\"" + getSortedNums.getSortedNums(nums) + "\"");

    // Task4 (RandomAlg)
    System.out.println("\n- Task4");
    Task4 ra = new Task4();
    Stream<Long> iterate = Stream.iterate(55L, seed -> ra.withSeed(seed).next());
    iterate.limit(5).forEach(System.out::println);

    // Task5
    System.out.println("\n- Task5");
    Stream<String> first = Stream.of("A", "B", "C", "D");
    Stream<String> second = Stream.of("1", "2", "3");

    System.out.println(Task5.zip(first, second).collect(Collectors.joining(" ")));
}

