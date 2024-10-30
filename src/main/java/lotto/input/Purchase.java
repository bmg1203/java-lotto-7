package lotto.input;

import static lotto.constants.ErrorMessage.INPUT_MUST_BE_NUMBER;
import static lotto.constants.ErrorMessage.PURCHASE_AMOUNT_UNIT_ERROR;

public class Purchase {
    private final int MIN_VALUE = 0;
    private final int DIVIDER = 1000;
    private final int purchase;

    public Purchase(int purchase) {
        isPositiveAmount(purchase);
        isDivisibleByThousand(purchase);
        this.purchase = purchase;
    }

    public int getPurchase() {
        return purchase;
    }

    private void isDivisibleByThousand(int purchase) {
        if (purchase % DIVIDER != 0) {
            throw new IllegalArgumentException(PURCHASE_AMOUNT_UNIT_ERROR.getMessage());
        }
    }

    private void isPositiveAmount(int purchase) {
        if (purchase <= MIN_VALUE) {
            throw new IllegalArgumentException(INPUT_MUST_BE_NUMBER.getMessage());
        }
    }
}
