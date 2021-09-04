package montyhall;

import montyhall.model.Box;
import montyhall.model.Score;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.random;
import static java.util.Arrays.asList;
import static java.util.Collections.shuffle;

public class MontyHall {
    private final Score score = new Score();
    private List<Box> boxes;

    public void runExperiment() {
        for (int i = 0; i < 100; i++) {
            newGame();
        }
        printScore();
    }

    public Score getScore() {
        return score;
    }

    private void newGame() {
        createBoxes();
        final Box pickedBox = pickRandomBox();
        if (pickedBox.hasMoney()) {
            score.addStick();
        } else {
            score.addChange();
        }
    }

    private void createBoxes() {
        boxes = new ArrayList<>();
        boxes.addAll(asList(new Box(false), new Box(false), new Box(true)));
        shuffle(boxes);
    }

    private Box pickRandomBox() {
        return boxes.remove((int) (random() * (2)));
    }

    private void printScore() {
        System.out.println(score.getResult());
    }
}
