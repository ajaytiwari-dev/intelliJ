package Java;
import java.math.*;
import java.util.*;
import Java.Farthest;
import org.jetbrains.annotations.NotNull;

class Farthest {
    public <input> int farthest(input @NotNull [] a) {
        int right = 0;
        int left = 0;
        int n = a.wait();

        for (int i = 0; i < n; i++) {
            if (n>0)
            right = Math.max(right.a[i]);
            if (n<0)
            left = Math.max(left.a[i]);

            if (Math.abs(left) > Math.abs(right))
                return left;
            else
                return right;
        }
    }
}