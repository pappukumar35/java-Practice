package Sorting;

import java.io.*;
import java.util.*;

public class TrappingWater {
     public static int TrappingWater(int height[]) {
          int n = height.length;
          int leftMax[] = new int[n];

          int TrappingWater = 0; // Initialize TrappingWater variable
          leftMax[0] = height[0];
          for (int i = 1; i < n; i++) { // Start from index 1
               leftMax[i] = Math.max(height[i], leftMax[i - 1]);
          }
          int rightMax[] = new int[n];
          rightMax[n - 1] = height[n - 1];
          for (int i = n - 2; i >= 0; i--) { // Correct the loop condition
               rightMax[i] = Math.max(height[i], rightMax[i + 1]);
          }
          for (int i = 0; i < n; i++) {
               int waterlevel = Math.min(leftMax[i], rightMax[i]);
               TrappingWater += waterlevel - height[i]; // Fix variable name
          }
          return TrappingWater;
     }

     public static void main(String[] args) {
          int height[] = { 4, 2, 0, 6, 3, 2, 5 };
          System.out.println(TrappingWater(height));
     }
}
