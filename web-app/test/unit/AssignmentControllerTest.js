describe("AssignmentController", function() {
	
	function generateString(length) {
		var result = "";
		for(var i = 0; i < length; i++) {
			result += "_";
		}
		return result;
	}
	
    it("should calculate the remaining characters", function() {
        expect(AssignmentController.getRemainingCharacters("")).toEqual(1000);
        expect(AssignmentController.getRemainingCharacters("a")).toEqual(999);
        expect(AssignmentController.getRemainingCharacters("ab")).toEqual(998);
        expect(AssignmentController.getRemainingCharacters(generateString(100))).toEqual(900);
        expect(AssignmentController.getRemainingCharacters(generateString(1000))).toEqual(0);

    })
    
     it("should say the number of remaining characters is 0 when the limit of characters has been exceeded", function() {
        expect(AssignmentController.getRemainingCharacters(generateString(1001))).toEqual(0);

    })
});