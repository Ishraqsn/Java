package dsa.dsRevision.array;

import java.util.Arrays;

public class
PlatformNeeded {

//    Sort both arrival(arr) and departure(dep) arrays.
//    Compare current element in arrival and departure array and pick smaller one among both.
//    If element is pick up from arrival array then increment platform_needed.
//    If element is pick up from departure array then decrement platform_needed.
//    While performing above steps, we need track count of maximum value reached for platform_needed.
//    In the end, we will return maximum value reached for platform_needed.
//
//    Time complexity : O(NLogN)
    public static void main(String[] args) {
        int arr[] = {100, 140, 150, 200, 215, 400};
        int dep[] = {110, 300, 210, 230,315, 600};
        System.out.println("Minimum platforms needed:"+findPlatformsRequiredForStation(arr,dep,6));
    }

    private static int findPlatformsRequiredForStation(int[] arr, int[] dep, int n) {
        int platform_needed = 0, maxPlatforms = 0;
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i = 0, j = 0;

        // Similar to merge in merge sort
        while (i < n && j < n)
        {
            if (arr[i] < dep[j])
            {
                platform_needed++;
                i++;
                if (platform_needed > maxPlatforms)
                    maxPlatforms = platform_needed;
            }
            else
            {
                platform_needed--;
                j++;
            }
        }
        return maxPlatforms;
    }
    }

