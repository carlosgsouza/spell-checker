/*
 * Please forgive this humble JavaScript code. I really wanted to focus on the tests and decided not to spend much time on the JavaScript functional code
 */
AssignmentController = {
	getRemainingCharacters: function (text) {
		return Math.max(0, 1000 - text.length);
	}
};