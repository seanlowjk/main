package seedu.savenus.logic.commands;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static seedu.savenus.testutil.TypicalMenu.getTypicalMenu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import seedu.savenus.logic.commands.exceptions.CommandException;
import seedu.savenus.model.Model;
import seedu.savenus.model.ModelManager;
import seedu.savenus.model.UserPrefs;
import seedu.savenus.model.recommend.UserRecommendations;
import seedu.savenus.model.savings.SavingsAccount;
import seedu.savenus.model.sorter.CustomSorter;

public class HistoryCommandTest {
    private Model model;

    @BeforeEach
    public void setUp() {
        model = new ModelManager(getTypicalMenu(), new UserPrefs(), new UserRecommendations(),
                new CustomSorter(), new SavingsAccount());
    }

    @Test
    public void execute_noCommands_history() throws CommandException {
        assertEquals(new HistoryCommand().execute(model).getFeedbackToUser(),
                HistoryCommand.MESSAGE_NO_HISTORY);
    }
}
