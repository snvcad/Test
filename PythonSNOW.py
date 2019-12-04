#Need to install requests package for python
import requests
 
# Set the request parameters
# sys_id 563504cc47410200e90d87e8dee490e2
# url = 'https://developer.service-now.com/api/sn_chg_rest/change/standard/92b8544047810200e90d87e8dee490b0?description=test&short_description=Reboot%20server&no_such_field=something'
url = 'https://developer.service-now.com/api/sn_chg_rest/change/standard/# sys_id 563504cc47410200e90d87e8dee490e2?description=test&short_description=Reboot%20server&no_such_field=something' 
# Eg. User name="username", Password="password" for this code sample.
user = 'admin'
pwd = 'llnB6Lb3TaYV'
 
# Set proper headers
headers = {"Accept":"application/xml"}
 
# Do the HTTP request
response = requests.post(url, auth=(user, pwd), headers=headers)

# Check for HTTP codes other than 200
if response.status_code != 200: 
    print('Status:', response.status_code, 'Headers:', response.headers, 'Error Response:', response.content)
    exit()
 
# Decode the XML response into a dictionary and use the data
print(response.content)

