minikube delete
minikube start --driver=virtualbox --memory 16192 --cpus 8

kubectl create namespace m

helm repo add ingress-nginx https://kubernetes.github.io/ingress-nginx/
helm repo update
helm install nginx ingress-nginx/ingress-nginx --namespace m -f nginx-ingress.yaml


sleep 30
kubectl apply -f kuber

minikube ip
kubectl get pods -w