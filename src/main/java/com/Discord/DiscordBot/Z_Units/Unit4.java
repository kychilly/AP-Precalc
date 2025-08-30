package com.Discord.DiscordBot.Z_Units;

import com.Discord.DiscordBot.Units.Question;

import static com.Discord.DiscordBot.Units.QuestionBank.unit4Questions;

public class Unit4 {

    public static int numUnit4Questions;

    public static void initializeUnit4Questions() {

        // Unit 4 - Functions Involving Parametrics, Vectors, and Matrices

        unit4Questions.add(new Question(
                "Which of the following is the parametric equation for a line passing through (1,2) with slope 3?",
                "x = 1 + 3t, y = 2 + t", "x = 1 + t, y = 2 + 3t", "x = 3 + t, y = 2 + 1t", "x = 1 + 2t, y = 3 + t",
                "B", 4, 3000, "easy"));

        unit4Questions.add(new Question(
                "Given vector v = <3, 4>, what is the magnitude of v?",
                "7", "5", "1", "12",
                "B", 4, 3001, "easy"));

        unit4Questions.add(new Question(
                "What is the dot product of vectors a = <1, 2> and b = <3, 4>?",
                "11", "5", "10", "7",
                "A", 4, 3002, "easy"));

        unit4Questions.add(new Question(
                "Which of the following represents the parametric equations of a circle with radius 5 centered at the origin?",
                "x = 5cos(t), y = 5sin(t)", "x = 5t, y = 5t", "x = 5sin(t), y = 5cos(t)", "x = 5+t, y = 5+t",
                "A", 4, 3003, "easy"));

        unit4Questions.add(new Question(
                "If v = <2, -3> and w = <-1, 4>, what is v + w?",
                "<1, 1>", "<3, 7>", "<-3, -7>", "<2, 1>",
                "A", 4, 3004, "easy"));

        unit4Questions.add(new Question(
                "Which of the following is the matrix product of \nA = [[1,2],[3,4]] and B = [[2,0],[1,3]]?",
                "[[4,6],[10,12]]", "[[4,6],[9,12]]", "[[2,5],[7,12]]", "[[3,6],[5,12]]",
                "B", 4, 3005, "medium"));

        unit4Questions.add(new Question(
                "Given parametric equations x = t^2, y = t^3, what is dy/dx in terms of t?",
                "2t/3t^2", "3t^2/2t", "t^3/2t", "3t/2t^2",
                "B", 4, 3006, "medium"));

        unit4Questions.add(new Question(
                "Find the unit vector in the direction of v = <4, 3>.",
                "<4/5, 3/5>", "<3/5, 4/5>", "<4, 3>", "<-4/5, -3/5>",
                "A", 4, 3007, "medium"));

        unit4Questions.add(new Question(
                "If a = <1,2,3> and b = <4,-5,6>, what is a · b?",
                "12", "12 + ?", "1", "-1",
                "A", 4, 3008, "medium"));

        unit4Questions.add(new Question(
                "Which of the following is the inverse of the matrix [[1,2],[3,4]]?",
                "[[-2,1],[3/2,-1/2]]", "[[4,-2],[-3,1]]", "[[-2,3],[1,-0.5]]", "[[1,2],[3,4]]",
                "C", 4, 3009, "hard"));

        unit4Questions.add(new Question(
                "Given parametric equations x = 2t + 1, y = 3t - 4, eliminate t to find the Cartesian equation.",
                "y = (3/2)x - 11/2", "y = (2/3)x + 1", "y = 3x - 4", "y = 2x + 3",
                "A", 4, 3010, "medium"));

        unit4Questions.add(new Question(
                "What is the cross product of u = <1,0,0> and v = <0,1,0>?",
                "<0,0,1>", "<1,1,0>", "<0,1,1>", "<0,0,0>",
                "A", 4, 3011, "medium"));

        unit4Questions.add(new Question(
                "If A = [[2,1],[0,3]], what is det(A)?",
                "6", "5", "3", "2",
                "B", 4, 3012, "medium"));

        unit4Questions.add(new Question(
                "The vector <3,-4> is multiplied by scalar 2. What is the result?",
                "<6,-8>", "<1.5,-2>", "<3,-4>", "<-6,8>",
                "A", 4, 3013, "easy"));

        unit4Questions.add(new Question(
                "Parametric equations x = cos(t), y = sin(t) represent which shape?",
                "Ellipse", "Circle", "Parabola", "Line",
                "B", 4, 3014, "easy"));

        unit4Questions.add(new Question(
                "If matrix A = [[1,2,3],[4,5,6]], what are its dimensions?",
                "2x3", "3x2", "2x2", "3x3",
                "A", 4, 3015, "easy"));

        unit4Questions.add(new Question(
                "Solve the system using matrices: \n2x + y = 5\nx - y = 1",
                "x=2, y=1", "x=1, y=2", "x=1, y=3", "x=3, y=2",
                "A", 4, 3016, "medium"));

        unit4Questions.add(new Question(
                "If vector v = <2, -1, 4>, what is -3v?",
                "<-6,3,-12>", "<6,-3,12>", "<-2,1,-4>", "<3,-1,4>",
                "A", 4, 3017, "medium"));

        unit4Questions.add(new Question(
                "Given matrices A = [[1,0],[2,1]] and B = [[3,4],[0,1]], find AB.",
                "[[3,4],[6,9]]", "[[3,4],[6,5]]", "[[3,4],[2,1]]", "[[3,0],[2,1]]",
                "B", 4, 3018, "hard"));

        unit4Questions.add(new Question(
                "Which of the following parametric equations represents a parabola?",
                "x = t, y = t^2", "x = cos(t), y = sin(t)", "x = t^2, y = t^2", "x = t + 1, y = 2t -1",
                "A", 4, 3019, "medium"));

        // Unit 4 - Functions Involving Parametrics, Vectors, and Matrices (continued)

        unit4Questions.add(new Question(
                "Given parametric equations x = t^2 - 1, y = 2t + 3, eliminate t to find the Cartesian equation.",
                "y = 2√(x+1) + 3", "y = 2(x+1) + 3", "y = x^2 + 3", "y = x + 2",
                "A", 4, 3020, "medium"));

        unit4Questions.add(new Question(
                "If vector a = <3, -2, 1> and vector b = <1, 4, -2>, what is a · b?",
                "3", "-1", "-1", "0",
                "B", 4, 3021, "medium"));

        unit4Questions.add(new Question(
                "Compute the magnitude of vector v = <5, -12>.",
                "13", "12", "17", "√169",
                "A", 4, 3022, "medium"));

        unit4Questions.add(new Question(
                "If u = <2, 3> and v = <-1, 4>, what is the scalar multiple 3u - 2v?",
                "<8,1>", "<4,1>", "<8,17>", "<0,14>",
                "A", 4, 3023, "medium"));

        unit4Questions.add(new Question(
                "The determinant of a 2x2 matrix [[a, b],[c, d]] is given by:",
                "ad - bc", "ab - cd", "ac - bd", "a + d",
                "A", 4, 3024, "easy"));

        unit4Questions.add(new Question(
                "Which of the following parametric equations represents a horizontal line?",
                "x = 3, y = t", "x = t, y = 3", "x = t^2, y = t", "x = 3t, y = 2t",
                "B", 4, 3025, "easy"));

        unit4Questions.add(new Question(
                "If matrix A = [[1,2,3],[0,1,4]] and matrix B = [[2,0],[1,1],[0,3]], what are the dimensions of AB?",
                "2x2", "2x3", "3x2", "3x3",
                "A", 4, 3026, "medium"));

        unit4Questions.add(new Question(
                "Which of the following vectors is perpendicular to v = <2,3>?",
                "<3,-2>", "<2,3>", "<-2,-3>", "<1,1>",
                "A", 4, 3027, "medium"));

        unit4Questions.add(new Question(
                "Find the inverse of the 2x2 matrix [[2,1],[5,3]].",
                "[[3,-1],[-5,2]]/1", "[[3,-1],[-5,2]]/1", "[[3,-1],[-5,2]]/1", "[[3,-1],[-5,2]]/1",
                "A", 4, 3028, "hard"));

        unit4Questions.add(new Question(
                "For the parametric curve x = cos(t), y = sin(t), what is dy/dx?",
                "-cot(t)", "tan(t)", "-cot(θ)", "-cot(t)?",
                "B", 4, 3029, "hard"));

        unit4Questions.add(new Question(
                "Given vectors a = <1,2,3> and b = <4,5,6>, what is a × b?",
                "<-3,6,-3>", "<3,-6,3>", "<-1,2,-1>", "<2,3,4>",
                "A", 4, 3030, "hard"));

        unit4Questions.add(new Question(
                "The matrix [[1,2],[3,4]] is multiplied by [[0,1],[1,0]]. What is the product?",
                "[[2,1],[4,3]]", "[[1,2],[3,4]]", "[[3,1],[4,2]]", "[[2,0],[4,3]]",
                "A", 4, 3031, "hard"));

        unit4Questions.add(new Question(
                "Eliminate t: x = t + 1, y = t^2 - 4t. What is the Cartesian equation?",
                "y = (x-1)^2 - 4(x-1)", "y = x^2 - 4x", "y = x^2 - 4", "y = x^2 + x - 4",
                "A", 4, 3032, "medium"));

        unit4Questions.add(new Question(
                "Vector v = <-3,6> is multiplied by scalar -2. What is the result?",
                "<6,-12>", "<-6,12>", "<3,-6>", "<-3,6>",
                "A", 4, 3033, "easy"));

        unit4Questions.add(new Question(
                "Which parametric equations describe a line through (0,0) with slope -2?",
                "x = t, y = -2t", "x = -2t, y = t", "x = t, y = 2t", "x = 2t, y = t",
                "A", 4, 3034, "easy"));

        unit4Questions.add(new Question(
                "Matrix A = [[1,0],[2,1]] and B = [[0,1],[1,0]]. Compute AB.",
                "[[0,1],[1,2]]", "[[1,0],[2,1]]", "[[1,1],[2,0]]", "[[0,0],[2,1]]",
                "A", 4, 3035, "medium"));

        unit4Questions.add(new Question(
                "If vector u = <2,1,3> and v = <1,0,4>, what is the scalar projection of u onto v?",
                "14/√17", "13/√17", "11/√17", "10/√17",
                "B", 4, 3036, "hard"));

        unit4Questions.add(new Question(
                "Compute the determinant of matrix [[4,3,2],[1,0,-1],[2,1,1]].",
                "5", "3", "7", "6",
                "D", 4, 3037, "hard"));

        unit4Questions.add(new Question(
                "Parametric equations: x = 2cos(t), y = 3sin(t). What shape is this?",
                "Circle", "Ellipse", "Parabola", "Hyperbola",
                "B", 4, 3038, "medium"));

        unit4Questions.add(new Question(
                "If A = [[1,2],[3,4]] and B = [[5,6],[7,8]], what is det(A+B)?",
                "-2", "0", "2", "4",
                "A", 4, 3039, "hard"));

        // Unit 4 - Functions Involving Parametrics, Vectors, and Matrices (continued)

        unit4Questions.add(new Question(
                "If vector a = <1,2,3> and b = <4,0,-1>, compute a × b.",
                "<2,13,-8>", "<-2,-13,8>", "<-2,13,8>", "<2,-13,8>",
                "A", 4, 3040, "hard"));

        unit4Questions.add(new Question(
                "Parametric equations: x = t^2, y = t^3. What is dy/dx in terms of t?",
                "3t^2 / 2t", "2t / 3t^2", "t^3 / 2t", "3t / 2t^2",
                "A", 4, 3041, "medium"));

        unit4Questions.add(new Question(
                "Matrix A = [[2,1,0],[0,1,3],[1,2,1]]. Compute det(A).",
                "3", "5", "7", "1",
                "B", 4, 3042, "hard"));

        unit4Questions.add(new Question(
                "Vector v = <3,-4,0>. Find the unit vector in the same direction.",
                "<3/5, -4/5, 0>", "<-3/5, 4/5, 0>", "<3, -4, 0>", "<1,0,0>",
                "A", 4, 3043, "medium"));

        unit4Questions.add(new Question(
                "Eliminate t: x = 3t-2, y = 2t+1. Find Cartesian equation.",
                "y = (2/3)x + 7/3", "y = (3/2)x - 2", "y = 2x + 1", "y = 3x - 2",
                "A", 4, 3044, "medium"));

        unit4Questions.add(new Question(
                "Matrix A = [[1,2],[3,4]]. What is A^(-1)?",
                "[[-2,1],[3/2,-1/2]]", "[[4,-2],[-3,1]]", "[[-2,3],[1,-0.5]]", "[[1,2],[3,4]]",
                "A", 4, 3045, "hard"));

        unit4Questions.add(new Question(
                "Compute the dot product of vectors a = <1,0,2> and b = <3,-1,1>.",
                "5", "4", "1", "-1",
                "B", 4, 3046, "medium"));

        unit4Questions.add(new Question(
                "Which parametric equations represent a vertical line x = 4?",
                "x = 4, y = t", "x = t, y = 4", "x = 4t, y = t", "x = t+4, y = t",
                "A", 4, 3047, "easy"));

        unit4Questions.add(new Question(
                "If A = [[1,0,2],[0,1,1],[1,2,1]], compute det(A).",
                "3", "4", "5", "2",
                "C", 4, 3048, "hard"));

        unit4Questions.add(new Question(
                "Vector u = <1,2,3>, v = <4,5,6>. Find u × v.",
                "<-3,6,-3>", "<3,-6,3>", "<-3,3,6>", "<0,0,0>",
                "A", 4, 3049, "hard"));

        unit4Questions.add(new Question(
                "Matrix multiplication: A = [[2,1],[3,4]], B = [[1,0],[0,1]]. Find AB.",
                "[[2,1],[3,4]]", "[[3,4],[2,1]]", "[[1,0],[0,1]]", "[[4,3],[1,2]]",
                "A", 4, 3050, "medium"));

        unit4Questions.add(new Question(
                "Parametric equations: x = cos(t), y = 2sin(t). What shape is this?",
                "Circle", "Ellipse", "Parabola", "Line",
                "B", 4, 3051, "medium"));

        unit4Questions.add(new Question(
                "If vector v = <2,3,6> and scalar k = -2, compute k*v.",
                "<-4,-6,-12>", "<4,6,12>", "<-2,-3,-6>", "<2,3,6>",
                "A", 4, 3052, "medium"));

        unit4Questions.add(new Question(
                "Given matrices A = [[1,2],[3,4]] and B = [[0,1],[1,0]], compute AB.",
                "[[2,1],[4,3]]", "[[1,2],[3,4]]", "[[1,1],[3,0]]", "[[0,0],[3,4]]",
                "A", 4, 3053, "medium"));

        unit4Questions.add(new Question(
                "Find the Cartesian equation of parametric curve x = t^2, y = 3t + 1.",
                "y = 3√x + 1", "y = 3x + 1", "y = 3x^2 + 1", "y = √(3x) + 1",
                "A", 4, 3054, "medium"));

        unit4Questions.add(new Question(
                "Compute the determinant of matrix [[2,0,1],[1,1,0],[3,2,1]].",
                "1", "2", "3", "4",
                "B", 4, 3055, "hard"));

        unit4Questions.add(new Question(
                "Vector a = <1,2,3>, b = <4,5,6>. Compute scalar projection of a onto b.",
                "32/√77", "12/√77", "17/√77", "31/√77",
                "A", 4, 3056, "hard"));

        unit4Questions.add(new Question(
                "Which parametric equations represent a parabola opening upwards?",
                "x = t, y = t^2", "x = t^2, y = t", "x = cos(t), y = sin(t)", "x = t + 1, y = 2t -1",
                "A", 4, 3057, "medium"));

        unit4Questions.add(new Question(
                "Find the inverse of 2x2 matrix [[4,3],[2,1]].",
                "[[-0.5,1.5],[1,-2]]", "[[1,-3],[-2,4]]", "[[1,0],[0,1]]", "[[3,4],[1,2]]",
                "A", 4, 3058, "hard"));

        unit4Questions.add(new Question(
                "If parametric equations x = 2t + 1, y = 5t - 3, what is dy/dx?",
                "5/2", "2/5", "-5/2", "1",
                "A", 4, 3059, "medium"));

        unit4Questions.add(new Question(
                "Vector u = <2, -1, 3>, vector v = <1, 4, -2>. Compute u × v.",
                "<-10,7,9>", "<-10,5,-9>", "<10,-7,9>", "<9,7,-10>",
                "A", 4, 3060, "hard"));

        unit4Questions.add(new Question(
                "Parametric equations: x = t^2 - 3, y = 2t + 1. Eliminate t.",
                "y = 2√(x+3) + 1", "y = 2(x+3) + 1", "y = √(2x) + 1", "y = x^2 + 1",
                "A", 4, 3061, "medium"));

        unit4Questions.add(new Question(
                "Matrix A = [[1,2,3],[0,1,4],[5,6,0]]. Compute det(A).",
                "1", "24", "-1", "12",
                "B", 4, 3062, "hard"));

        unit4Questions.add(new Question(
                "Find the unit vector in the direction of v = <0, -3, 4>.",
                "<0, -3/5, 4/5>", "<0, 3/5, -4/5>", "<0, -3, 4>", "<1,0,0>",
                "A", 4, 3063, "medium"));

        unit4Questions.add(new Question(
                "Eliminate t: x = 4t - 1, y = 3t + 2. Find the Cartesian equation.",
                "y = (3/4)x + 11/4", "y = (4/3)x - 2", "y = 3x + 2", "y = 4x - 1",
                "A", 4, 3064, "medium"));

        unit4Questions.add(new Question(
                "Matrix A = [[2,3],[5,7]]. Find A^(-1).",
                "[[7,-3],[-5,2]]/(-1)", "[[7,-3],[-5,2]]/1", "[[2,3],[5,7]]", "[[3,2],[7,5]]",
                "A", 4, 3065, "hard"));

        unit4Questions.add(new Question(
                "Compute the dot product of a = <2,1,3> and b = <-1,0,4>.",
                "10", "12", "13", "9",
                "A", 4, 3066, "medium"));

        unit4Questions.add(new Question(
                "Which parametric equations represent a horizontal line y = 5?",
                "x = t, y = 5", "x = 5, y = t", "x = t^2, y = 5", "x = 5t, y = t",
                "A", 4, 3067, "easy"));

        unit4Questions.add(new Question(
                "Matrix A = [[1,0,2],[2,1,3],[1,2,0]]. Compute det(A).",
                "5", "3", "4", "6",
                "B", 4, 3068, "hard"));

        unit4Questions.add(new Question(
                "Vectors a = <1,2,3>, b = <3,1,0>. Compute a × b.",
                "<-3,9,-5>", "<-3,3,-5>", "<3,-9,5>", "<-2,6,-5>",
                "A", 4, 3069, "hard"));

        unit4Questions.add(new Question(
                "Matrix multiplication: A = [[1,2],[0,1]], B = [[2,1],[3,0]]. Compute AB.",
                "[[8,1],[3,0]]", "[[5,1],[3,0]]", "[[5,2],[0,1]]", "[[2,1],[0,1]]",
                "B", 4, 3070, "medium"));

        unit4Questions.add(new Question(
                "Parametric equations: x = 3cos(t), y = 2sin(t). What shape is this?",
                "Circle", "Ellipse", "Parabola", "Line",
                "B", 4, 3071, "medium"));

        unit4Questions.add(new Question(
                "Vector v = <-2,5,-3>, scalar k = 3. Compute k*v.",
                "<-6,15,-9>", "<6,-15,9>", "<-2,5,-3>", "<2,-5,3>",
                "A", 4, 3072, "medium"));

        unit4Questions.add(new Question(
                "Matrices A = [[1,2],[3,4]], B = [[0,1],[1,0]]. Compute AB.",
                "[[2,1],[4,3]]", "[[1,2],[3,4]]", "[[1,1],[3,0]]", "[[0,0],[3,4]]",
                "A", 4, 3073, "medium"));

        unit4Questions.add(new Question(
                "Find the Cartesian equation of x = t + 1, y = 2t^2.",
                "y = 2(x-1)^2", "y = 2x^2", "y = 2x + 1", "y = (x+1)^2",
                "A", 4, 3074, "medium"));

        unit4Questions.add(new Question(
                "Compute det([[3,1,2],[0,1,4],[1,2,0]]).",
                "5", "3", "7", "4",
                "D", 4, 3075, "hard"));

        unit4Questions.add(new Question(
                "Vector a = <2,3,1>, b = <1,0,4>. Compute scalar projection of a onto b.",
                "6/√17", "5/√17", "7/√17", "4/√17",
                "C", 4, 3076, "hard"));

        unit4Questions.add(new Question(
                "Which parametric equations represent a parabola opening downwards?",
                "x = t, y = -t^2", "x = t^2, y = t", "x = cos(t), y = sin(t)", "x = t+1, y = 2t-1",
                "A", 4, 3077, "medium"));

        unit4Questions.add(new Question(
                "Find the inverse of matrix [[3,2],[5,3]].",
                "[[3,-2],[-5,3]]", "[[-3,2],[5,-3]]", "[[3,2],[5,3]]", "[[2,3],[3,5]]",
                "A", 4, 3078, "hard"));

        unit4Questions.add(new Question(
                "Parametric equations x = t - 1, y = 4t + 3. Find dy/dx.",
                "4", "1/4", "-4", "0",
                "A", 4, 3079, "medium"));

        // Unit 4 - Functions Involving Parametrics, Vectors, and Matrices (continued)

        unit4Questions.add(new Question(
                "Vector a = <1,2,3>, vector b = <4,-1,2>. Compute a × b.",
                "<7,10,-9>", "<8,-10,7>", "<-7,-10,9>", "<7,-10,9>",
                "A", 4, 3080, "hard"));

        unit4Questions.add(new Question(
                "Parametric equations: x = 2t + 1, y = t^2 - 3. Eliminate t.",
                "y = (1/2)(x-1)^2 - 3", "y = 2(x-1)^2 - 3", "y = (x+1)^2 - 3", "y = x^2 - 3",
                "A", 4, 3081, "medium"));

        unit4Questions.add(new Question(
                "Matrix A = [[2,1,0],[1,3,2],[0,1,1]]. Compute det(A).",
                "3", "4", "5", "2",
                "C", 4, 3082, "hard"));

        unit4Questions.add(new Question(
                "Find the unit vector in the direction of v = <-3,0,4>.",
                "<-3/5,0,4/5>", "<3/5,0,-4/5>", "<-3,0,4>", "<0,1,0>",
                "A", 4, 3083, "medium"));

        unit4Questions.add(new Question(
                "Eliminate t: x = 3t + 2, y = t^2 - 1. Find Cartesian equation.",
                "y = (1/3)(x-2)^2 - 1", "y = 3(x-2)^2 - 1", "y = (x+2)^2 - 1", "y = x^2 - 1",
                "A", 4, 3084, "medium"));

        unit4Questions.add(new Question(
                "Matrix A = [[1,2],[3,5]]. Find A^(-1).",
                "[[5,-2],[-3,1]]", "[[-5,2],[3,-1]]", "[[1,2],[3,5]]", "[[2,1],[5,3]]",
                "A", 4, 3085, "hard"));

        unit4Questions.add(new Question(
                "Compute the dot product of a = <2,-1,3> and b = <0,4,1>.",
                "-1", "2", "3", "4",
                "C", 4, 3086, "medium"));

        unit4Questions.add(new Question(
                "Which parametric equations represent a vertical line x = -2?",
                "x = -2, y = t", "x = t, y = -2", "x = -2t, y = t", "x = t-2, y = t",
                "A", 4, 3087, "easy"));

        unit4Questions.add(new Question(
                "Matrix A = [[1,0,2],[0,1,3],[1,2,1]]. Compute det(A).",
                "3", "4", "5", "2",
                "C", 4, 3088, "hard"));

        unit4Questions.add(new Question(
                "Vectors a = <1,3,2>, b = <2,-1,4>. Compute a × b.",
                "<14,0,-7>", "<10,-7,5>", "<-10,7,-5>", "<8,5,-10>",
                "B", 4, 3089, "hard"));

        unit4Questions.add(new Question(
                "Matrix multiplication: A = [[2,1],[1,3]], B = [[1,0],[0,1]]. Compute AB.",
                "[[2,1],[1,3]]", "[[3,1],[1,2]]", "[[2,3],[1,0]]", "[[1,2],[3,1]]",
                "A", 4, 3090, "medium"));

        unit4Questions.add(new Question(
                "Parametric equations: x = 4cos(t), y = 3sin(t). What shape is this?",
                "Circle", "Ellipse", "Parabola", "Line",
                "B", 4, 3091, "medium"));

        unit4Questions.add(new Question(
                "Vector v = <1,-2,3>, scalar k = -4. Compute k*v.",
                "<-4,8,-12>", "<4,-8,12>", "<-1,2,-3>", "<1,-2,3>",
                "A", 4, 3092, "medium"));

        unit4Questions.add(new Question(
                "Matrices A = [[1,3],[2,4]], B = [[0,1],[1,0]]. Compute AB.",
                "[[3,1],[4,2]]", "[[1,3],[2,4]]", "[[1,1],[2,0]]", "[[0,0],[2,4]]",
                "A", 4, 3093, "medium"));

        unit4Questions.add(new Question(
                "Find Cartesian equation for parametric curve x = t-1, y = t^2 + 2t.",
                "y = (x+1)^2 + 2(x+1)", "y = (x-1)^2 + 2(x-1)", "y = x^2 + 2x", "y = x^2 + 2",
                "B", 4, 3094, "medium"));

        unit4Questions.add(new Question(
                "Compute det([[1,2,3],[0,1,4],[2,1,0]]).",
                "3", "1", "5", "4",
                "C", 4, 3095, "hard"));

        unit4Questions.add(new Question(
                "Vector a = <3,1,2>, b = <1,2,1>. Compute scalar projection of a onto b.",
                "7/√6", "8/√6", "6/√6", "5/√6",
                "B", 4, 3096, "hard"));

        unit4Questions.add(new Question(
                "Which parametric equations represent a parabola opening upwards?",
                "x = t, y = t^2", "x = t^2, y = t", "x = cos(t), y = sin(t)", "x = t+1, y = 2t-1",
                "A", 4, 3097, "medium"));

        unit4Questions.add(new Question(
                "Find the inverse of 2x2 matrix [[5,3],[7,4]].",
                "[[4,-3],[-7,5]]", "[[-4,3],[7,-5]]", "[[5,3],[7,4]]", "[[3,5],[4,7]]",
                "A", 4, 3098, "hard"));

        unit4Questions.add(new Question(
                "Parametric equations x = t+2, y = 5t-1. Find dy/dx.",
                "5", "1/5", "-5", "0",
                "A", 4, 3099, "medium"));


        numUnit4Questions = unit4Questions.size();
        System.out.printf("There are %d questions in unit 4%n", numUnit4Questions);

    }

}
