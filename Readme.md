required structures: sequence
variables: length, width, rainfall, lengthinches, widthinches, dimension, cubicinches, gallons
test cases: a. 5ft x 5ft, 1 inch rain (output: "15.58")  ; b. 4ft x 4ft 2 inch rain (output: "19.95")

BEGIN
	Prompt how many feet long?
	Save input as length
	Prompt how many feet wide?
	Save input as width
	Prompt inches of rain?
	Save input as rainfall
	Multiply length by 12
	Save result as lengthinches
	Multiply width by 12
	Save result as widthinches
	Multiply widthinches by lengthinches
	Save result as dimension
	Multiply dimension by rainfall
	Save result as cubicinches
	Divide cubicinches by 231
	Save result as gallons
	Print gallons
END