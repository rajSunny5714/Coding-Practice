int findDuplicate(vector<int> &arr) 
{
    // Write your code here
     {
    int n = arr.size();
    int duplicate;
    vector<int> frequency(n, 0);
    for (int index = 0; index < n; index++) 
    {
        int currentNumber = arr[index];
        frequency[currentNumber]++;
    }
    for (int currentNumber = 1; currentNumber <= n - 1; currentNumber++) 
    {
        if (frequency[currentNumber] > 1) {
          duplicate = currentNumber;
        }
    }
    return duplicate;
     }
}
