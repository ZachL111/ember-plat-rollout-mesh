package io.portfolio;

public final class PolicyTest {
    public static void main(String[] args) {
        var signalcase_1 = new Policy.Signal(80, 77, 23, 18, 4);
        if (Policy.score(signalcase_1) != 98) throw new AssertionError("score mismatch");
        if (!Policy.classify(signalcase_1).equals("review")) throw new AssertionError("decision mismatch");
        var signalcase_2 = new Policy.Signal(67, 96, 9, 13, 8);
        if (Policy.score(signalcase_2) != 178) throw new AssertionError("score mismatch");
        if (!Policy.classify(signalcase_2).equals("accept")) throw new AssertionError("decision mismatch");
        var signalcase_3 = new Policy.Signal(84, 83, 17, 8, 8);
        if (Policy.score(signalcase_3) != 200) throw new AssertionError("score mismatch");
        if (!Policy.classify(signalcase_3).equals("accept")) throw new AssertionError("decision mismatch");
    }
}
