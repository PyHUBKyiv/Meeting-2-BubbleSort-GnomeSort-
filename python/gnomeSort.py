a=[1, 5, 3, 8, 7]
i=0
while i<len(a):
	if a[i]>a[a+1]:
		a[i],a[i+1]=a[i+1],a[i]
		while True:
			i-=1
			if a[i]<a[i+1]:
				break
			a[i],a[i+1]=a[i+1],a[i]
			i-=1
		i+=1

print(a)
