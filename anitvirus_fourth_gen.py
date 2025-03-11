import yara
import hashlib
from pathlib import Path
import os

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


buffer_size = 4906
def hash_check(file_path):
    sha256 = hashlib.sha256()
    with open (file_path, 'rb') as raw_bin_file:
        while chunk:= raw_bin_file.read(buffer_size):
            sha256.update(chunk)
    return sha256.hexdigest()

print(Path.cwd())
    