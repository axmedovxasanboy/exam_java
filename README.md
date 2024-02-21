**2. Solution**

**Deadlock** occurs when two or more threads waiting others to finish their work.

*For Example:* Let's say we have 2 threads working. 

First thread is trying to lock first method which should be unlocked by second thread and unlock second method. 

Second thread is trying to lock second method which should be unlocked by first thread and unlock first method.

They wait for each other to have the job done forever. And this called **Deadlock**

In order to solve this problem threads should lock the first method if second method is unlock-able. 

If not that thread may be waited for a particular time to check again.
****
**5. Solution**
Regular Expression for date checker: ^((0[1-9]|[12]\d|3[01])(-)(0[1-9]|1[1,2])(-)(19|20)\d{2})$