def command = "eksctl get cluster --region "+region
def proc = command.execute()
proc.waitFor()
def out= proc.text.split("\n")
def list_n=[]
for (i in out){
    out2=i.split()[0]
    list_n.addAll(out2)


}
list_n.remove(0)
return list_n
