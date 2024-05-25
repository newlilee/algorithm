package com.leetcode;

import org.testng.annotations.Test;

/**
 * @author clx
 */
public class TestMeetingRoomsTwo {

	@Test
	public void meetingRoomsTwo() {
		// case 1
		int[][] caseOne = { { 0, 30 }, { 5, 10 }, { 15, 20 } };
		System.out.println(MeetingRoomsTwo.minMeetingRooms(caseOne));

		// case 2
		int[][] caseTwo = { { 7, 10 }, { 2, 4 } };
		System.out.println(MeetingRoomsTwo.minMeetingRooms(caseTwo));
	}
}
