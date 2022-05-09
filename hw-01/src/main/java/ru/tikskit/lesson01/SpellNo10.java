package ru.tikskit.lesson01;

/**
 * Hello world!
 *
 */
public class SpellNo10 implements Spell
{
    private final int ROWS_COUNT = 25;
    private final int COLS_COUNT = 25;


    @Override
    public void cast() {
        Painter painter = new Painter(ROWS_COUNT, COLS_COUNT);
        for (int rowNo = 0; rowNo < COLS_COUNT; rowNo++) {
            for (int colNo = 0; colNo < ROWS_COUNT; colNo++) {
                painter.point(colNo, rowNo, colNo < rowNo && colNo >= rowNo / 2?  '#' : '.');
            }
        }

        painter.flush();

    }
}