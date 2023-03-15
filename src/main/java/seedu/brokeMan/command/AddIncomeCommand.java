package seedu.brokeMan.command;

import seedu.brokeMan.income.Income;
import seedu.brokeMan.income.IncomeList;

public class AddIncomeCommand extends Command {
    public static final String COMMAND_WORD = "addIncome";
    private final Income income;
    public static final String MESSAGE_USAGE = COMMAND_WORD + ": add expense to the expense list.\n" +
            "|  Parameters: a/ <amount> d/ <description> t/ <time>\n" +
            "|  Example: " + COMMAND_WORD + " a/ 3000 d/ salary t/ 1400H";

    public AddIncomeCommand(double amount, String info, String time) {
        this.income = new Income(amount, info, time);
    }

    public void execute() {
        IncomeList.addIncome(income);
    }
}
