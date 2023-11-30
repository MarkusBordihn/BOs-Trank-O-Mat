/*
 * Copyright 2023 Markus Bordihn
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package de.markusbordihn.trankomat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Constants {

  // General Mod definitions
  public static final String MOD_ID = "trank_o_mat";
  public static final String MOD_ID_PREFIX = MOD_ID + ":";
  public static final String MOD_NAME = "Trank-O-Mat";
  public static final String LOG_REGISTER_PREFIX = "⛽ Register " + MOD_NAME;
  public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);

  // Prefixes
  public static final String TEXT_PREFIX = "text." + MOD_ID + ".";
  public static final String BLOCK_PREFIX = "block." + MOD_ID + ".";
  public static final String ITEM_PREFIX = "item." + MOD_ID + ".";

  // Colors
  public static final int FONT_COLOR_BLACK = 0;
  public static final int FONT_COLOR_DARK_GREEN = 43520;
  public static final int FONT_COLOR_GRAY = 11184810;
  public static final int FONT_COLOR_GREEN = 5635925;
  public static final int FONT_COLOR_RED = 16733525;
  public static final int FONT_COLOR_WARNING = FONT_COLOR_RED;
  public static final int FONT_COLOR_YELLOW = 16777045;
  public static final int FONT_COLOR_WHITE = 16777215;

  protected Constants() {}
}
