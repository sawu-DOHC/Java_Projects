Lottery Statistics Program

This program is designed to analyze PowerBall lottery number data. The lottery involves picking five numbers in the range of 1–69 and a “PowerBall” number in the range of 1–35. The program reads numbers from a file and provides various statistics about them including the most common numbers, the least common numbers, the most overdue numbers, and the frequency of each number.

If the first five numbers match the first five winning numbers in any order, and the PowerBall number matches the winning PowerBall number, the jackpot is won, which is a very large amount of money. If only some of the winning numbers are matched, a lesser amount is won, depending on how many of the winning numbers are matched.

REQUIREMENTS

1. Display the 10 Most Common Numbers
2. Display the 10 Least Common Numbers
3. Display the 10 Most Overdue Numbers: Shows the numbers that have not been drawn for the longest time.
4. Display the Frequency of Each Number (1-69)
5. Display the Frequency of Each PowerBall Number (1-35)


HOW IT WORKS OVERVIEW

1) Create array to store information about numbers using Number Objects (range 1-69 and index = 0-5 )
2) Create array to store information about numbers using Powerball Number Objects ( range 1-35 and index = 6 )
3) Create ticket objects that can be manipulated
4) Compare ticket objects to winning ticket object using brute force comparion O(n^2)
4) Calculate frequency/occourance of each number
5) Calculate "recency" or what i call "overdueness", this basically increases by 1 every time a number does not occour, when a number occours its "overdueness" or "recency" is set back to 0. 
6) Perform sorting operations using bubble sort
7) Print data




~~~~ OUTPUT EXAMPLE (SCROLL ALL THE WAY DOWN TO SEE INTERESTING BITS) ~~~~~

Object created from row:  0    Powerball:  true    Matching Numbers:   0   Reward:   0.00$ Winning lottery ticket created/defined

Object created from row:  1    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row:  2    Powerball: false    Matching Numbers:   3   Reward:  30.00$ 
Object created from row:  3    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row:  4    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row:  5    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row:  6    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row:  7    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row:  8    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row:  9    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 10    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 11    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 12    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 13    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 14    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 15    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 16    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 17    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 18    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 19    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 20    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 21    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 22    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 23    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 24    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 25    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 26    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 27    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 28    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 29    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 30    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 31    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 32    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 33    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 34    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 35    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 36    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 37    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 38    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 39    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 40    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 41    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 42    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 43    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 44    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 45    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 46    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 47    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 48    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 49    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 50    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 51    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 52    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 53    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 54    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 55    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 56    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 57    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 58    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 59    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 60    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 61    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 62    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 63    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 64    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 65    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 66    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 67    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 68    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 69    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 70    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 71    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 72    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 73    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 74    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 75    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 76    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 77    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 78    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 79    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 80    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 81    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 82    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 83    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 84    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 85    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 86    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 87    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 88    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 89    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 90    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 91    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 92    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 93    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 94    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 95    Powerball: false    Matching Numbers:   3   Reward:  30.00$ 
Object created from row: 96    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 97    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 98    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 99    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 100    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 101    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 102    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 103    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 104    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 105    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 106    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 107    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 108    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 109    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 110    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 111    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 112    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 113    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 114    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 115    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 116    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 117    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 118    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 119    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 120    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 121    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 122    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 123    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 124    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 125    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 126    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 127    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 128    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 129    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 130    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 131    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 132    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 133    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 134    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 135    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 136    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 137    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 138    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 139    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 140    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 141    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 142    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 143    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 144    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 145    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 146    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 147    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 148    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 149    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 150    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 151    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 152    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 153    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 154    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 155    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 156    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 157    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 158    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 159    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 160    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 161    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 162    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 163    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 164    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 165    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 166    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 167    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 168    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 169    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 170    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 171    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 172    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 173    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 174    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 175    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 176    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 177    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 178    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 179    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 180    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 181    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 182    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 183    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 184    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 185    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 186    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 187    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 188    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 189    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 190    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 191    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 192    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 193    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 194    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 195    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 196    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 197    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 198    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 199    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 200    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 201    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 202    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 203    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 204    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 205    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 206    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 207    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 208    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 209    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 210    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 211    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 212    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 213    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 214    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 215    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 216    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 217    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 218    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 219    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 220    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 221    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 222    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 223    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 224    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 225    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 226    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 227    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 228    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 229    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 230    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 231    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 232    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 233    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 234    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 235    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 236    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 237    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 238    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 239    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 240    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 241    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 242    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 243    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 244    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 245    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 246    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 247    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 248    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 249    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 250    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 251    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 252    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 253    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 254    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 255    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 256    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 257    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 258    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 259    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 260    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 261    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 262    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 263    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 264    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 265    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 266    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 267    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 268    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 269    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 270    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 271    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 272    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 273    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 274    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 275    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 276    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 277    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 278    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 279    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 280    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 281    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 282    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 283    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 284    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 285    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 286    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 287    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 288    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 289    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 290    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 291    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 292    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 293    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 294    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 295    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 296    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 297    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 298    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 299    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 300    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 301    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 302    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 303    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 304    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 305    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 306    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 307    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 308    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 309    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 310    Powerball: false    Matching Numbers:   3   Reward:  30.00$ 
Object created from row: 311    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 312    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 313    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 314    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 315    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 316    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 317    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 318    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 319    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 320    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 321    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 322    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 323    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 324    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 325    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 326    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 327    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 328    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 329    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 330    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 331    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 332    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 333    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 334    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 335    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 336    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 337    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 338    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 339    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 340    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 341    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 342    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 343    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 344    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 345    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 346    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 347    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 348    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 349    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 350    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 351    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 352    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 353    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 354    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 355    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 356    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 357    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 358    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 359    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 360    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 361    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 362    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 363    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 364    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 365    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 366    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 367    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 368    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 369    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 370    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 371    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 372    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 373    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 374    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 375    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 376    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 377    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 378    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 379    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 380    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 381    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 382    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 383    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 384    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 385    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 386    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 387    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 388    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 389    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 390    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 391    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 392    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 393    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 394    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 395    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 396    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 397    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 398    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 399    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 400    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 401    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 402    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 403    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 404    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 405    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 406    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 407    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 408    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 409    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 410    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 411    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 412    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 413    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 414    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 415    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 416    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 417    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 418    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 419    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 420    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 421    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 422    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 423    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 424    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 425    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 426    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 427    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 428    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 429    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 430    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 431    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 432    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 433    Powerball: false    Matching Numbers:   3   Reward:  30.00$ 
Object created from row: 434    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 435    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 436    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 437    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 438    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 439    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 440    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 441    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 442    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 443    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 444    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 445    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 446    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 447    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 448    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 449    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 450    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 451    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 452    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 453    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 454    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 455    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 456    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 457    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 458    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 459    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 460    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 461    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 462    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 463    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 464    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 465    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 466    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 467    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 468    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 469    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 470    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 471    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 472    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 473    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 474    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 475    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 476    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 477    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 478    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 479    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 480    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 481    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 482    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 483    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 484    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 485    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 486    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 487    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 488    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 489    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 490    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 491    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 492    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 493    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 494    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 495    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 496    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 497    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 498    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 499    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 500    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 501    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 502    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 503    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 504    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 505    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 506    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 507    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 508    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 509    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 510    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 511    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 512    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 513    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 514    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 515    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 516    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 517    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 518    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 519    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 520    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 521    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 522    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 523    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 524    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 525    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 526    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 527    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 528    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 529    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 530    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 531    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 532    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 533    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 534    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 535    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 536    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 537    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 538    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 539    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 540    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 541    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 542    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 543    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 544    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 545    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 546    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 547    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 548    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 549    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 550    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 551    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 552    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 553    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 554    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 555    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 556    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 557    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 558    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 559    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 560    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 561    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 562    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 563    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 564    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 565    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 566    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 567    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 568    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 569    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 570    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 571    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 572    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 573    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 574    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 575    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 576    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 577    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 578    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 579    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 580    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 581    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 582    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 583    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 584    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 585    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 586    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 587    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 588    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 589    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 590    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 591    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 592    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 593    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 594    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 595    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 596    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 597    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 598    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 599    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 600    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 601    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 602    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 603    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 604    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 605    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 606    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 607    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 608    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 609    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 610    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 611    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 612    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 613    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 614    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 615    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 616    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 617    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 618    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 619    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 620    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 621    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 622    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 623    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 624    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 625    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 626    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 627    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 628    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 629    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 630    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 631    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 632    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 633    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 634    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 635    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 636    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 637    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 638    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 639    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 640    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 641    Powerball: false    Matching Numbers:   2   Reward:  20.00$ 
Object created from row: 642    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 643    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 644    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 645    Powerball: false    Matching Numbers:   3   Reward:  30.00$ 
Object created from row: 646    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 647    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 648    Powerball: false    Matching Numbers:   1   Reward:  10.00$ 
Object created from row: 649    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 650    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 651    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 652    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 653    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 654    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 655    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 656    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 657    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 658    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 659    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 660    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 661    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 662    Powerball: false    Matching Numbers:   0   Reward:   0.00$ 
Object created from row: 663    Powerball: false    Matching Numbers:   1   Reward:  10.00$  	example of 1 winning number
Object created from row: 664    Powerball: false    Matching Numbers:   2   Reward:  20.00$  	example of 2 winning numbers
Object created from row: 665    Powerball: false    Matching Numbers:   3   Reward:  30.00$  	example of 3 winning numbers
Object created from row: 666    Powerball: false    Matching Numbers:   4   Reward:  40.00$  	example of 4 winning numbers
Object created from row: 667    Powerball: false    Matching Numbers:   5   Reward:  50.00$  	example of 5 winning numbers
Object created from row: 668    Powerball: false    Matching Numbers:   6   Reward:  60.00$  	example of 6 winning numbers
Object created from row: 669    Powerball:  true    Matching Numbers:   6   Reward:  9999.00$ 	example of 6 winning numbers with powerball number in index 5

1) 10 MOST COMMON NUMBERS, ORDERED BY FREQUENCY, DESCENDING (greatest to least). 
   Ranking      Value  Frequency 
         1          1         98 
         2          5         78 
         3         66         78 
         4         24         74 
         5          7         73 
         6         21         72 
         7         18         71 
         8         35         69 
         9         33         69 
        10         26         68 
        11         25         68 

2) 10 LEAST COMMON NUMBERS, ORDERED BY FREQUENCY, ASCENDING (least to greatest). 
   Ranking      Value  Frequency 
         1         41         28 
         2         39         36 
         3         49         40 
         4         65         40 
         5         37         41 
         6         23         44 
         7         52         46 
         8         54         46 
         9         68         47 
        10         69         47 
        11         61         48 

3) THE 10 MOST OVERDUE NUMBERS (greatest to least). 
   Ranking      Value Overdueness 
         1         49        520 
         2         14        418 
         3          4        401 
         4         42        346 
         5         39        314 
         6         20        312 
         7         33        309 
         8         41        274 
         9         11        251 
        10         43        232 
        11         24        216 

4) DISPLAY THE FREQUENCY OF EACH NUMBER (1-69)
     Value  Frequency 
         1         98 
         2         64 
         3         61 
         4         60 
         5         78 
         6         60 
         7         73 
         8         64 
         9         56 
        10         61 
        11         54 
        12         67 
        13         67 
        14         57 
        15         59 
        16         60 
        17         67 
        18         71 
        19         62 
        20         57 
        21         72 
        22         64 
        23         44 
        24         74 
        25         68 
        26         68 
        27         60 
        28         59 
        29         67 
        30         60 
        31         66 
        32         54 
        33         69 
        34         64 
        35         69 
        36         57 
        37         41 
        38         53 
        39         36 
        40         51 
        41         28 
        42         49 
        43         48 
        44         50 
        45         48 
        46         61 
        47         50 
        48         51 
        49         40 
        50         57 
        51         63 
        52         46 
        53         60 
        54         46 
        55         50 
        56         61 
        57         57 
        58         64 
        59         58 
        60         49 
        61         48 
        62         67 
        63         48 
        64         55 
        65         40 
        66         78 
        67         56 
        68         47 
        69         47 

5) DISPLAY THE FREQUENCY OF EACH POWERBALL NUMBER (1-35)
     Value  Frequency 
         1         19 
         2         25 
         3         15 
         4         14 
         5         23 
         6         14 
         7         22 
         8         18 
         9         19 
        10         16 
        11         16 
        12         24 
        13         19 
        14         19 
        15         15 
        16         14 
        17         18 
        18         23 
        19         17 
        20         21 
        21         22 
        22         22 
        23         13 
        24         21 
        25         17 
        26         21 
        27         13 
        28         17 
        29         19 
        30         21 
        31         26 
        32         19 
        33         21 
        34         18 
        35         28 


Process finished with exit code 0
