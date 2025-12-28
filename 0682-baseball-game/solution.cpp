class Solution {
public:
    int calPoints(vector<string>& operations) {
        stack<int> st;
        for(string i:operations){
            
             if(i=="C"){
                if(!st.empty()) st.pop();
            }
            else if(i=="+"){

                int a=st.top();
                st.pop();
                int b=st.top();
                st.pop();

                int sum=a+b;

                st.push(b);
                st.push(a);
                st.push(sum);

            }

            else if(i=="D"){
                st.push(2*st.top());
            }

            else{
                  st.push(stoi(i));
            }
        }

        int sum=0;

        while(!st.empty()){
            sum+=st.top();
            st.pop();
        }

        return sum;
    }
};
