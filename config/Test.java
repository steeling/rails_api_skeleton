public class Test {

  static void printStaircase(long[] coins) {
    int numCoins;
    int caseHeight;
    int coinsnumStacks;
    List<Integer> memoize = new ArrayList<Integer>();

    for (int i = 0; i < coins.length; ++i) {
      caseHeight = 0;
      coinsnumStacks = 1;
      numCoins = coins[i];
      while(coinsnumStacks < numCoins){
        ++caseHeight;
        coinsnumStacks = coinsnumStacks + 1;
      }
      memoize.add(coinsnumStacks) = caseHeight;

      System.out.println(caseHeight);
    }
  }
}



static void printStaircase(long[] coins) {
  Map<Long, Long> memoized = new HashMap<Long, Long>();

    for (int i = 0; i < coins.length; ++i) {
      System.out.println(getHeight(coins[i], memoized));
    }
}

static long getHeight(long numCoins, Map<Long, Long> memoized) {
  if (memoized.containsKey(numCoins))
    return memoized.get(numCoins);
  if(numCoins == 0){
    memoized.put(0, 0);
    return 0;
  }
  if (numCoins == 1){
    memoized.put(1, 1);
    return 1;
  }
  long previousHeight;
  long calc;
  if(memoized.containsKey(numCoins - 1)) {
    previousHeight = memoized.get(numCoins - 1);
    calc = (previousHeight * previousHeight + previousHeight) / 2;
    if (calc <= numCoins){
      memoized.put(numCoins, previousHeight + 1);
    } else {
      memoized.put(numCoins, previousHeight);
    }
  } else {
    previousHeight = getHeight(numCoins - 1, memoized, numStacks);
    memoized.put(numCoins, previousHeight);
    return previousHeight;
  }

}

n * n + 1
/ 2

* 1, 1
** 2, 3
*** 3, 6
**** 4, 10
***** 5, 15

16


* 1, 1
**2, 3
** 5, 2