class Solution {
public:
    bool isValid(string s) {
        stack<char> st; 
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s[i];
            if(ch == '(' || ch == '{' || ch == '[') {
                st.push(s[i]);
            } else {
                if(!st.empty()) {
                    char top = st.top();
                    if( (ch == '}' && top == '{') ||
                        (ch == ']' && top == '[') ||
                        (ch == ')' && top == '(')) {
                        // if matches then pop 
                        st.pop();
                    } else {
                        return false;
                    }
                }
                else{
                    // if stack is empty && get a closing bracket means the string is unbalanced 
                    
                    return false;
                }
            }
        }
        
        if(st.empty()) {
            return true;
        } 
        return false;
        
    }
};