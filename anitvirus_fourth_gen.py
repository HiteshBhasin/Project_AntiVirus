
# import yara as yr
# import hashlib
# from pathlib import Path
# import os
# import pyclamd
import psutil
import scapy.all as scapy


'''
purpose of this script will be to use hashlib first 
and return the hexvalue once that is done we will double check the 
file with yara rules to make sure it is legit. 
'''
#----------------------------------------------------------------------
'''
 here we are taking the path of a file and ready 4906 chinks as a time. 
 we can choose any buffer_size a chunk to read the file. While 
 statement make sure that there is a data to read, once there is no more data the while loop breaks.
 once all done the func return the hexdigit. 
'''

# arr_of_malware_sig = []
# buffer_size = 4906
# def hash_check(file_path):
#     sha256 = hashlib.sha256()
#     with open (file_path, 'rb') as raw_bin_file:
#         while chunk:= raw_bin_file.read(buffer_size):
#             sha256.update(chunk)
#     return sha256.hexdigest()

# def yara_rule_check(file_path):
#     rule=yr.compile(file_path)
#     matches = rule.match(malware_file) 
#     return matches

#  the function below still need to be done and fixed. https://xael.org/pages/pyclamd-en.html
# def using_clamd():
    
# #  connecting to clamAV daemon, this is running locally. 
#     try:
#         cd = pyclamd.ClamdUnixSocket()
#         cd.ping()
#     except pyclamd.ConnectionError:
#         try:
#             cd = pyclamd.ClamdNetworkSocket()
#             cd.ping()
#         except pyclamd.ConnectionError:
#             raise ValueError("Couldn't connect to ClamAV daemon (clamd)")
#     open('./EICAR', 'w').write(cd.EICAR())
#     open('./EICAR', 'w').write(b"X5O!P%@AP[4\\PZX54(P^)7CC)7}$EICAR-STANDARD-ANTIVIRUS-TEST-FILE!$H+H*")


    
 

# def running_first_gen(file_path):
#     hash_num = hash_check(file_path)
#     for  signature in arr_of_malware_sig:
#         if signature==hash_num:
#             print("this is dangerous")
#         else:
#             flag=yara_rule_check(file_path)
#             if flag == True:
#                 print("this is a malware")
#             else:
#                 print("everything is good now")
'''
Need psutil to use with the behaviour blocking , scapy and need RNN for ML.
'''


            
  
    
    