env:
  - name: ENVTEST
  value: 'Hello from DC!'

======


env:
  - name: ENVTEST
    valueFrom:
      configMapKeyRef:
        name: example-config 
        key: ENVTEST
envFrom: 
  - configMapRef:
      name: lsm-example-cm
