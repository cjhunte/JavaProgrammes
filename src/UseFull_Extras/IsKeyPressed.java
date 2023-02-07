package UseFull_Extras;

import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;

/*
this class can be used to run a program until a key is pressed in order to use it use the following command

if (IsKeyPressed.isWPressed())
{
    // do something
}

*/


public class IsKeyPressed {
   private static boolean wPressed = false;
   public static boolean isWPressed() {
      synchronized (IsKeyPressed.class) {
         return wPressed;
      }
   }

   public static void main(String[] args) {
      KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher((KeyEventDispatcher) new KeyEventDispatcher() {

         @Override
         public boolean dispatchKeyEvent(KeyEvent ke) {
            synchronized (IsKeyPressed.class) {
               switch (ke.getID()) {
                  case KeyEvent.KEY_PRESSED:
                     if (ke.getKeyCode() == KeyEvent.VK_W) {
                        wPressed = true;
                     }
                     break;

                  case KeyEvent.KEY_RELEASED:
                     if (ke.getKeyCode() == KeyEvent.VK_W) {
                        wPressed = false;
                     }
                     break;
               }
               return false;
            }
         }
      });
   }
}